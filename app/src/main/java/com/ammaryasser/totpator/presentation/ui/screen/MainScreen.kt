package com.ammaryasser.totpator.presentation.ui.screen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Outlined
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ammaryasser.totpator.R
import com.ammaryasser.totpator.data.models.Account
import com.ammaryasser.totpator.data.repos.PrefsRepo
import com.ammaryasser.totpator.presentation.ui.component.ConfirmationDialog
import com.ammaryasser.totpator.presentation.ui.component.FAB
import com.ammaryasser.totpator.presentation.ui.component.SwipeCard
import com.ammaryasser.totpator.presentation.ui.component.TopBar
import com.ammaryasser.totpator.presentation.ui.icon.GridView
import com.ammaryasser.totpator.presentation.ui.icon.ViewAgenda
import com.ammaryasser.totpator.presentation.viewmodels.MainScreenViewModel
import com.ammaryasser.totpator.util.copyText
import com.ammaryasser.totpator.util.generateTotp
import com.ammaryasser.totpator.util.getClipboardManager
import kotlinx.coroutines.launch


private lateinit var vm: MainScreenViewModel


@Composable
fun MainScreen(
    onAddAccount: () -> Unit,
    onEditAccount: (Int) -> Unit,
    onNavToPreferencesScreen: () -> Unit,
    onNavToAboutScreen: () -> Unit,
) {

    vm = viewModel(factory = MainScreenViewModel.Factory)

    Box(
        Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {

        Column(Modifier.fillMaxSize()) {
            val loading = vm.loading.observeAsState()
            val accounts = vm.accounts.observeAsState()
            val isLoading = loading.value ?: true
            val isEmpty = accounts.value?.isEmpty() ?: true
            val coScope = rememberCoroutineScope()
            val preferenceRepo = PrefsRepo(LocalContext.current)
            var viewAsGrid by remember { mutableStateOf(true) }

            LaunchedEffect(Unit) {
                coScope.launch {
                    viewAsGrid = preferenceRepo.getViewAsGrid(viewAsGrid)
                }
            }

            MainScreenTopBar(
                viewAsGrid = viewAsGrid,
                hideViewIcon = isEmpty,
                onNavToPreferencesScreen = onNavToPreferencesScreen,
                onNavToAboutScreen = onNavToAboutScreen,
                onSwitchView = {
                    viewAsGrid = !viewAsGrid
                    coScope.launch {
                        preferenceRepo.putViewAsGrid(viewAsGrid)
                    }
                },
            )

            when {
                isLoading || isEmpty -> LoadingOrEmpty(isLoading)
                else -> AccountsGrid(
                    viewAsGrid,
                    Modifier.weight(1f),
                    accounts.value!!,
                    onEditAccount
                )
            }
        }

        FAB(Modifier.align(Alignment.BottomEnd), onAddAccount)
    }
}


@Composable
fun MainScreenTopBar(
    viewAsGrid: Boolean,
    hideViewIcon: Boolean,
    onNavToPreferencesScreen: () -> Unit,
    onNavToAboutScreen: () -> Unit,
    onSwitchView: () -> Unit,
    onSearch: () -> Unit = {},
) {
    TopBar {
        var isMenuExpanded by remember { mutableStateOf(false) }

        IconButton(onClick = onSearch) {
            Icon(
                Outlined.Search,
                stringResource(R.string.search),
                tint = colorScheme.onPrimary
            )
        }

        if (!hideViewIcon) IconButton(onClick = onSwitchView) {
            Icon(
                if (viewAsGrid) ViewAgenda() else GridView(),
                stringResource(R.string.switch_view),
                tint = colorScheme.onPrimary
            )
        }

        IconButton(onClick = { isMenuExpanded = true }) {
            Icon(
                Outlined.MoreVert,
                stringResource(R.string.more),
                tint = colorScheme.onPrimary
            )
        }

        MainScreenMenu(isMenuExpanded, onNavToPreferencesScreen, onNavToAboutScreen) {
            isMenuExpanded = false
        }
    }
}


@Composable
fun MainScreenMenu(
    isMenuExpanded: Boolean,
    onNavToPreferencesScreen: () -> Unit,
    onNavToAboutScreen: () -> Unit,
    onDismiss: () -> Unit
) {
    val ctx = LocalContext.current

    DropdownMenu(
        expanded = isMenuExpanded,
        onDismissRequest = onDismiss
    ) {
        DropdownMenuItem(
            text = {
                Text(stringResource(R.string.preferences))
            },
            leadingIcon = {
                Icon(Outlined.Build, stringResource(R.string.preferences))
            },
            onClick = onNavToPreferencesScreen
        )

        DropdownMenuItem(
            text = {
                Text(stringResource(R.string.about))
            },
            leadingIcon = {
                Icon(Outlined.Info, stringResource(R.string.about))
            },
            onClick = onNavToAboutScreen
        )

        HorizontalDivider(Modifier.height(1.dp))

        val mailSubject = stringResource(R.string.x_feedback, stringResource(R.string.app_name))

        DropdownMenuItem(
            text = {
                Text(stringResource(R.string.x_feedback, stringResource(R.string.send)))
            },
            leadingIcon = {
                Icon(Icons.AutoMirrored.Default.Send, stringResource(R.string.x_feedback))
            },
            onClick = {
                onDismiss()
                Intent(Intent.ACTION_SENDTO).run {
                    data = "mailto:".toUri()

                    putExtra(Intent.EXTRA_EMAIL, arrayOf(ctx.getString(R.string.author_email)))
                    putExtra(Intent.EXTRA_SUBJECT, mailSubject)

                    ctx.startActivity(Intent.createChooser(this, mailSubject))
                }
            }
        )
    }
}


@Composable
fun LoadingOrEmpty(isLoading: Boolean) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        if (isLoading) CircularProgressIndicator(
            modifier = Modifier.size(size = 48.dp),
            color = colorScheme.primary,
            strokeWidth = 4.dp,
        )
        else Text(
            text = stringResource(R.string.empty_list),
            color = colorScheme.onBackground,
        )
    }
}


@Composable
fun AccountsGrid(
    viewAsGrid: Boolean,
    modifier: Modifier,
    accounts: List<Account>,
    onEditAccount: (Int) -> Unit,
) {
    LazyVerticalStaggeredGrid(
        columns =
            if (viewAsGrid) StaggeredGridCells.Adaptive(minSize = 155.dp)
            else StaggeredGridCells.Fixed(1),
        modifier = modifier,
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 88.dp),
        verticalItemSpacing = 16.dp,
        horizontalArrangement = Arrangement.spacedBy(space = 16.dp)
    ) {
        items(
            items = accounts,
            key = { System.nanoTime() }
        ) { account ->
            var showDialog by remember { mutableStateOf(false) }
            var totp by remember { mutableStateOf("") }

            val updateTotp = { totp = generateTotp(account.key) }

            updateTotp()

            SwipeCard(
                issuer = account.issuer,
                username = account.username,
                totp = totp,
                notes = account.notes,
                onTotpExpire = updateTotp,
                onSwipeToStart = {
                    showDialog = true
                },
                onSwipeToEnd = {
                    onEditAccount(account.id)
                },
                onClick = {
                    getClipboardManager().copyText(totp)
                },
            )

            if (showDialog) {
                ConfirmationDialog(
                    title = stringResource(R.string.dialog_delete_title, account.issuer),
                    text = stringResource(R.string.dialog_delete_text),
                    confirmText = stringResource(R.string.delete),
                    dismissText = stringResource(R.string.keep),
                    onDismiss = { showDialog = false }
                ) {
                    vm.deleteAccount(account)
                }
            }
        }
    }
}
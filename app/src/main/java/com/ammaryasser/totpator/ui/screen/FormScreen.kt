package com.ammaryasser.totpator.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons.Outlined
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ammaryasser.totpator.R
import com.ammaryasser.totpator.data.account.Account
import com.ammaryasser.totpator.ui.component.FormTextField
import com.ammaryasser.totpator.ui.component.TopBar
import com.ammaryasser.totpator.ui.icon.CorporateFare
import com.ammaryasser.totpator.util.getClipboardManager
import com.ammaryasser.totpator.util.showToast
import com.ammaryasser.totpator.viewmodel.FormScreenViewModel


@Composable
fun FormScreen(
    toBeEditedAccId: Int?, // for editing mode
    onNavBack: () -> Unit
) {
    val vm: FormScreenViewModel = viewModel(factory = FormScreenViewModel.Factory)

    Column(
        Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {

        var issuerValue by remember { mutableStateOf("") }
        var usernameValue by remember { mutableStateOf("") }
        var keyValue by remember { mutableStateOf("") }
        var notesValue by remember { mutableStateOf("") }
        var account by remember { mutableStateOf(Account(issuer = "", key = "")) }

        LaunchedEffect(Unit) {
            toBeEditedAccId?.run {
                if (this != -1)
                    vm.getAccountById(this).collect {
                        account = it
                        account.run {
                            issuerValue = issuer
                            usernameValue = username
                            keyValue = key
                            notesValue = notes
                        }
                    }
            }
        }

        FormScreenTopBar(onNavBack = onNavBack) {
            issuerValue = issuerValue.trim()
            usernameValue = usernameValue.trim()
            keyValue = keyValue.trim()
            notesValue = notesValue.trim()

            when {
                issuerValue.isBlank() && keyValue.isBlank() -> showToast("Name and secret key are mandatory!")
                issuerValue.isBlank() -> showToast("Name is mandatory!")
                keyValue.isBlank() -> showToast("Your secret key is mandatory!")
                else -> {
                    account.apply {
                        issuer = issuerValue
                        username = usernameValue
                        key = keyValue
                        notes = notesValue
                    }

                    vm.saveAccount(account)

                    onNavBack()
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {

            FormTextField(
                CorporateFare(),
                stringResource(R.string.issuer_label),
                stringResource(R.string.issuer_placeholder),
                issuerValue,
            ) { issuerValue = it }

            FormTextField(
                Outlined.Person,
                stringResource(R.string.username_label),
                stringResource(R.string.username_placeholder),
                usernameValue,
                optional = true
            ) { usernameValue = it }

            FormTextField(
                Outlined.Lock,
                R.string.key,
                R.string.key_placeholder,
                keyValue,
                canPaste = true,
                onPaste = {
                    getClipboardManager().primaryClip
                        ?.getItemAt(0)
                        ?.text
                        ?.also { keyValue = it.toString() }
                }
            ) { keyValue = it }

            FormTextField(
                Outlined.Info,
                R.string.notes_label,
                R.string.notes_placeholder,
                notesValue,
                optional = true
            ) { notesValue = it }

        }

    }
}


@Composable
fun FormScreenTopBar(
    onNavBack: () -> Unit,
    onSave: () -> Unit,
) {
    TopBar(
        title = stringResource(R.string.add_account),
        navBack = true,
        onBack = onNavBack,
    ) {
        IconButton(onClick = onSave) {
            Icon(
                Outlined.Check,
                stringResource(R.string.save),
                tint = colorScheme.onPrimary
            )
        }
    }
}
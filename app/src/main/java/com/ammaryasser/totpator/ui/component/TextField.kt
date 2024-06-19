package com.ammaryasser.totpator.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization

import com.ammaryasser.totpator.ui.icon.ContentPaste


@Composable
fun FormTextField(
    icon: ImageVector,
    labelResId: Int,
    placeholderResId: Int,
    value: String,
    optional: Boolean = false,
    canPaste: Boolean = false,
    onPaste: () -> Unit = {},
    onValueChange: (String) -> Unit
) = FormTextField(
    icon,
    stringResource(labelResId),
    stringResource(placeholderResId),
    value,
    optional,
    canPaste,
    onPaste,
    onValueChange
)


@Composable
fun FormTextField(
    icon: ImageVector,
    label: String,
    placeholder: String,
    value: String,
    optional: Boolean = false,
    canPaste: Boolean = false,
    onPaste: () -> Unit = {},
    onValueChange: (String) -> Unit
) {
    val pasteIcon: @Composable () -> Unit = {
        IconButton(onClick = onPaste) {
            Icon(ContentPaste(), "", tint = colorScheme.secondary)
        }
    }

    var notifyError by remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = value,
        onValueChange = {
            onValueChange(it)
            notifyError = !optional and it.isBlank()
        },
        leadingIcon = {
            Icon(icon, "", tint = colorScheme.primary)
        },
        trailingIcon = if (canPaste) pasteIcon else null,
        label = {
            Text(label)
        },
        placeholder = {
            Text(placeholder)
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next,
            capitalization = KeyboardCapitalization.Sentences,
        ),
        singleLine = true,
        isError = notifyError,
    )
}
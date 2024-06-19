package com.ammaryasser.totpator.util

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import com.ammaryasser.totpator.R
import com.ammaryasser.totpator.TotpatorApp
import com.atlassian.onetime.core.TOTPGenerator
import com.atlassian.onetime.model.TOTPSecret
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


val roundedShape = RoundedCornerShape(
    topStart = 8.dp,
    topEnd = 12.dp,
    bottomStart = 12.dp,
    bottomEnd = 8.dp
)

fun getClipboardManager(): ClipboardManager =
    TotpatorApp.context().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

fun ClipboardManager.copyText(text: String) {
    val clipData = ClipData.newPlainText("text", text)
    setPrimaryClip(clipData)
    showToast(TotpatorApp.context().getString(R.string.copied))
}

fun showToast(text: String, length: Int = 0) =
    Toast.makeText(TotpatorApp.context(), text, length).show()

fun generateTotp(key: String) = TOTPGenerator()
    .generateCurrent(TOTPSecret.fromBase32EncodedString(key))
    .value

fun schedule(
    delay: Long,
    unit: TimeUnit = if (delay <= 60L) TimeUnit.SECONDS else TimeUnit.MILLISECONDS,
    function: () -> Unit
) {
    Executors
        .newSingleThreadScheduledExecutor()
        .schedule(function, delay, unit)
}

fun scheduleAtFixedRate(
    delay: Long,
    rate: Long,
    unit: TimeUnit = if (delay <= 60L) TimeUnit.SECONDS else TimeUnit.MILLISECONDS,
    function: () -> Unit
) {
    Executors
        .newSingleThreadScheduledExecutor()
        .scheduleWithFixedDelay(function, delay, rate, unit)
}
package com.ammaryasser.totpator

import android.app.Application
import android.content.Context


class TotpatorApp : Application() {
    init {
        app = this
    }

    companion object {
        private lateinit var app: TotpatorApp

        fun context(): Context = app.applicationContext
    }
}
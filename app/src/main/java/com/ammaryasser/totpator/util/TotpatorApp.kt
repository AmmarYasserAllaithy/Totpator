package com.ammaryasser.totpator.util

import android.app.Application
import android.content.Context


class TotpatorApp : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: TotpatorApp? = null

        fun context(): Context {
            return instance!!.applicationContext
        }
    }

}
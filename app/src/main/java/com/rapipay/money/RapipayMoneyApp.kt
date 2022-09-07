package com.rapipay.money

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RapipayMoneyApp : Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: RapipayMoneyApp? = null

        fun applicationContext(): Context {
            return instance!!.applicationContext
        }
    }
}
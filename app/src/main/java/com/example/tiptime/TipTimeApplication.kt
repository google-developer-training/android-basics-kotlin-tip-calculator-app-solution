package com.example.tiptime

import android.app.Application
import com.google.android.material.color.DynamicColors

class TipTimeApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)

    }
}
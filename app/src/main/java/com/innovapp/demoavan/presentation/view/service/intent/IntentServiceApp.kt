package com.innovapp.demoavan.presentation.view.service.intent

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.innovapp.demoavan.presentation.view.activity.SplashActivity

/**
 * CREATE by RaulEB on 6/08/2021
 **/
class IntentServiceApp : IntentService("intent") {
    override fun onHandleIntent(p0: Intent?) {
        val intent = Intent(applicationContext, SplashActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        //intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
        intent.action = Intent.ACTION_VIEW
        applicationContext.startActivity(intent)
        Log.w("TAG-IntentServiceApp", "Execute IntentServiceApp")
    }
}
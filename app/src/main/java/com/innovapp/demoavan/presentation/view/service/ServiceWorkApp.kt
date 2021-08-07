package com.innovapp.demoavan.presentation.view.service

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.innovapp.demoavan.presentation.view.activity.SplashActivity
import com.innovapp.demoavan.presentation.view.service.intent.IntentServiceApp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * CREATE by RaulEB on 6/08/2021
 **/
class ServiceWorkApp(private val context: Context, workParams: WorkerParameters) :
    Worker(context, workParams) {

    override fun doWork(): Result {
        return try {
            context.startService(Intent(context, IntentServiceApp::class.java))
            Log.w("TAG-WORKER", "Execute Worker")
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }

    }

    fun execute() = runBlocking {
        launch {
            delay(30000)
            val intent = Intent(context, SplashActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
            Log.w("TAG-WORKER", "Execute Worker")
            Result.success()
        }
    }
}
package com.innovapp.demoavan.presentation.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkRequest
import com.innovapp.demoavan.R
import com.innovapp.demoavan.presentation.view.service.ServiceWorkApp
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
    }

    override fun onBackPressed() {
        val request: WorkRequest = OneTimeWorkRequestBuilder<ServiceWorkApp>()
            .setInitialDelay(9, TimeUnit.SECONDS)
            .build()

        WorkManager.getInstance(this)
            .enqueue(request)
        finish()
        super.onBackPressed()
    }
}
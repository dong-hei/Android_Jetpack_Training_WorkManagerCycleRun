package com.dk.workmanagercyclerun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

/**
 * WorkManage 주기적 실행
 * 어떤 로직을 매 시간마다 사용하고 싶을 때 사용
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //(최소값 15분)15분마다 실행 / TimeUnit.HOURS로 시간으로 변경도 가능하다.
        val wm = PeriodicWorkRequestBuilder<WorkManager1>(15, TimeUnit.MINUTES).build()
        WorkManager.getInstance(this).enqueue(wm)
    }
}
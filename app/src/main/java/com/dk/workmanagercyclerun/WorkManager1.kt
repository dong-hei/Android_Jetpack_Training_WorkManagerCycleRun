package com.dk.workmanagercyclerun

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.text.SimpleDateFormat
import java.util.Date

class WorkManager1 (context: Context, workerParameters: WorkerParameters) :
    Worker(context, workerParameters) {
    override fun doWork(): Result {

        val format = SimpleDateFormat("hh:mm:ss")
        val currentTime = format.format(Date())
        Log.d("wm", currentTime)
        return Result.success()
    }
}
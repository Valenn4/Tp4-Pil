package com.example.countapplication.mvp.view

import android.app.Activity
import java.lang.ref.WeakReference

open class ActivityView(activity: Activity) {
    private var activityRef : WeakReference<Activity> = WeakReference(activity)

    val activity: Activity?
        get() = activityRef.get()
}
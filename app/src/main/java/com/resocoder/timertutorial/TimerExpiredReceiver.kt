package com.resocoder.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.resocoder.timertutorial.util.NotificationUtil
import com.resocoder.timertutorial.util.PrefUtil
//import android.support.v4.content.ContextCompat.startActivity
import android.text.format.Time


class TimerExpiredReceiver : BroadcastReceiver() {
    val WAKE: String = "Wake up" // https://discuss.kotlinlang.org/t/unresolved-reference-another-kotlin-class/3115/2?u=mikeumus

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

        val myAct = Intent(context, TimerActivity::class.java)
        myAct.putExtra(WAKE, true)
        myAct.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(myAct)
    }
}

package com.resocoder.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.resocoder.timertutorial.util.NotificationUtil
import com.resocoder.timertutorial.util.PrefUtil
//import android.support.v4.content.ContextCompat.startActivity


class TimerExpiredReceiver : BroadcastReceiver() {
    val WAKE: String = "Wake up" // https://discuss.kotlinlang.org/t/unresolved-reference-another-kotlin-class/3115/2?u=mikeumus

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

        val myAct = Intent(context, TimerActivity::class.java)
//        val myAct = Intent(R.id.next_action)
        myAct.putExtra(WAKE, true)
        myAct.setAction("next_action")
//        myAct.flags = Intent.FLAG_FROM_BACKGROUND
        context.startActivity(myAct)
    }
}

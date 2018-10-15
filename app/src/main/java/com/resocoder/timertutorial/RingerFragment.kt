package com.resocoder.timertutorial

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_ringer.*


class RingerFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_ringer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        end_timer_button.setOnClickListener {
            val random = 1

//            val nextAction = RingerFragmentDirections.nextAction()
//            nextAction.setNumOfPhotos(random.nextInt(100))
            Log.v("TimerActivity", "here!")

            Navigation.findNavController(it).navigate(R.id.next_action)
        }
    }
}

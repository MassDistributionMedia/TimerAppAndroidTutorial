package com.resocoder.timertutorial.ui.ringer

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.resocoder.timertutorial.R

class RingerFragment : Fragment() {

    companion object {
        fun newInstance() = RingerFragment()
    }

    private lateinit var viewModel: RingerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_ringer, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RingerViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

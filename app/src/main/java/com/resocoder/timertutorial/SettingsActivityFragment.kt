package com.resocoder.timertutorial

import android.os.Bundle
//import android.support.v7.preference.PreferenceFragmentCompat
import androidx.preference.PreferenceFragment


class SettingsActivityFragment : PreferenceFragment() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }
}
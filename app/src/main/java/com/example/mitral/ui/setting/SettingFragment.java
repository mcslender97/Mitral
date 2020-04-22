package com.example.mitral.ui.setting;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import com.example.mitral.R;
public class SettingFragment extends PreferenceFragmentCompat{
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}

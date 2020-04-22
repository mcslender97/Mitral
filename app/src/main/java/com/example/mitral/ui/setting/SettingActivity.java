package com.example.mitral.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mitral.R;
import com.example.mitral.ui.main.MainActivity;

public class SettingActivity extends AppCompatActivity {
    private SettingViewModel settingViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);
       // Button buttonSettings = findViewById(R.id.to);
        SettingFragment settingFragment = new SettingFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.setting_view,settingFragment).commit();
       /* buttonSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent goToSettings = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goToSettings);
            }
        });*/
    }
}

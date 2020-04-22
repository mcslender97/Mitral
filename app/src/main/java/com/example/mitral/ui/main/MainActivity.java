package com.example.mitral.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mitral.R;
import com.example.mitral.ui.setting.SettingActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button settingButton = findViewById(R.id.toSetting);
        settingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent confirmSettingChanges = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(confirmSettingChanges);
            }
        });
    }
}

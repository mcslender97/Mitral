package com.example.mitral.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mitral.R;
import com.example.mitral.ui.main.MainActivity;

public class SettingMainActivity extends AppCompatActivity {
    private SettingViewModel settingViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.confirm_changes);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent confirmSettingChanges = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(confirmSettingChanges);
            }
        });
    }
}

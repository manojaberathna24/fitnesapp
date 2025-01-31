package com.example.fitnessapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HealthTipsActivity extends AppCompatActivity {

    private TextView healthTipsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);

        healthTipsText = findViewById(R.id.healthTipsText);
        healthTipsText.setText("1. Drink plenty of water.\n2. Eat a balanced diet.\n3. Get enough sleep.\n4. Exercise regularly.");
    }
}

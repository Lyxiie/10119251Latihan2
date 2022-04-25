package com.example.a10119251latihan2_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class AlmostActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almostthere);

        button= findViewById(R.id.btn_verify);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
            startActivity(intent);
        });

    }
}
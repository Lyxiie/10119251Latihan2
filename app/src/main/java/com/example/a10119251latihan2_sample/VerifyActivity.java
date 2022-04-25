package com.example.a10119251latihan2_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifyaccount);

        button= findViewById(R.id.btn_send);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(VerifyActivity.this, HomeActivity.class);
            startActivity(intent);
        });

    }
}
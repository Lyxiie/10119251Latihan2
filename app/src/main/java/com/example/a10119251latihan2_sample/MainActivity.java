package com.example.a10119251latihan2_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= findViewById(R.id.button_register);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

    }
}


//Tanggal Pengerjaan :23 dan 25 April 2022
//Deskripsi Pengerjaan :
//        Tanggal 23 April :  1. Upload asset gambar ke dalam program
//                            2. Memasukan berbagai values string dan color
//                            3. Pembuatan activity_login, activity_register, activity_almostthere, activity_verifyaccount, dan activity_home
//                            4. Pembuatan bg_btn, bg_button, bg_line, bg_profile untuk background pada btn_style dan edit_style
//                            5. Memasukan library baru untuk pembuatan lingkaran foto di activity_home
//                            6. Pembuatan LoginActivity, RegisterActivity, AlmostActivit, VerifyActivity, dan HomeActivity
//                            7. Terjadi Error, pengerjaan dilanjutkan tanggal 25 April
//
//        Tanggal 25 April :  1. Perbaikan Error dari tanggal 23 April
//                            2. Penghapusan LoginActivity dan activity_login untuk digantikan dengan MainActivity dan activity_main
//                            3. Pembuatan Method Intent untuk menyambungkan Activity
//                            4. Memasukan foto ke folder drawable sebagai foto profile
//NIM :10119251
//Nama :Muhamad Ridwan
//Kelas :IF6
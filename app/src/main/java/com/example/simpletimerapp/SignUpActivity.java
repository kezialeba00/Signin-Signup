package com.example.simpletimerapp;  // Ganti dengan nama package aplikasi kamu

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup); // Hubungkan dengan XML SignUp

        // Inisialisasi Button
        Button registerBtn = findViewById(R.id.registerbtn);

        // Aksi ketika tombol REGISTER ditekan
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode di sini untuk menyimpan data ke database atau pindah ke halaman lain
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup activity setelah pindah halaman
            }
        });
    }
}


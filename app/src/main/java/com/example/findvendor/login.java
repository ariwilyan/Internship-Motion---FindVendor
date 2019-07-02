package com.example.findvendor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button btn_daftar_login;
    private Button btn_masuk_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_daftar_login = findViewById(R.id.btn_daftar_login);
        btn_masuk_login = findViewById(R.id.btn_masuk_login);

        btn_daftar_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, daftar.class));
            }
        });

        btn_masuk_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, utama.class));
            }
        });
    }
}

package com.example.findvendor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileVendor extends AppCompatActivity {

    private ImageView btn_back;
    private Button btn_pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_vendor);

        btn_back = findViewById(R.id.profile);
        btn_pesan = findViewById(R.id.btn_pesan);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileVendor.this, PilihVendorActivity.class));
            }
        });

        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileVendor.this, PilihVendorActivity.class));
            }
        });
    }
}

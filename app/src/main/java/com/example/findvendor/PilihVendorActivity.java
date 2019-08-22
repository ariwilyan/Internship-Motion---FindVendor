package com.example.findvendor;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PilihVendorActivity extends AppCompatActivity {

    private ImageView btn_back;
    private TextView btn_pilih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_vendor);

        btn_back = findViewById(R.id.profile);
        btn_pilih = findViewById(R.id.btn_pilih);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PilihVendorActivity.this, utama.class));
            }
        });

        btn_pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PilihVendorActivity.this, ProfileVendor.class));
            }
        });
    }
}

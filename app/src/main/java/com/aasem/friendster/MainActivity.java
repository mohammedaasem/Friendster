package com.aasem.friendster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnUser, btnHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUser = findViewById(R.id.btn_user);
        btnHotel = findViewById(R.id.btn_hotel);
        btnUser.setOnClickListener(this);
        btnHotel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_user:
                openUserHome();
                break;

            case R.id.btn_hotel:
                openHotelHome();
                break;
        }
    }

    public void openUserHome() {
        startActivity(new Intent(MainActivity.this, UserHome.class));
    }

    public void openHotelHome() {
        startActivity(new Intent(MainActivity.this, HotelLogin.class));
    }

}

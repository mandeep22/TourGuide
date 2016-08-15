package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hotel = (TextView) findViewById(R.id.stay);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stayIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(stayIntent);
            }
        });

        TextView entertainment = (TextView) findViewById(R.id.entertainment);
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent entertainmentIntent = new Intent(MainActivity.this, EntertainmentActivity.class);
                startActivity(entertainmentIntent);
            }
        });

        TextView shop = (TextView) findViewById(R.id.shop);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shopIntent = new Intent(MainActivity.this, ShopActivity.class);
                startActivity(shopIntent);
            }
        });

        TextView eat = (TextView) findViewById(R.id.eat);
        eat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eatIntent = new Intent(MainActivity.this, EatAcitivity.class);
                startActivity(eatIntent);
            }
        });
    }
}

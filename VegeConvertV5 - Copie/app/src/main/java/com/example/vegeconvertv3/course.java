package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class course extends AppCompatActivity {

    private ImageView arrowLeft;
    private ImageView house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        arrowLeft = (ImageView) findViewById(R.id.arrow_left);
        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagePlat = new Intent(getApplicationContext(),recette.class);
                startActivity(pagePlat);
                finish();
            }
        });

        house = (ImageView) findViewById(R.id.house);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageConnection = new Intent(getApplicationContext(),connection.class);
                startActivity(pageConnection);
                finish();
            }
        });
    }
}

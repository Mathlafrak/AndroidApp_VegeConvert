package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class choix_regime extends AppCompatActivity {

   //private ImageView arrowRight;
    private Button buttonGo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_regime);

        //this.arrowRight = (ImageView) findViewById(R.id.arrow_right);
        this.buttonGo = findViewById(R.id.buttonGo);
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageChoixMenu = new Intent(getApplicationContext(),choix_menu.class);
                startActivity(pageChoixMenu);
                finish();
            }
        });
    }
}
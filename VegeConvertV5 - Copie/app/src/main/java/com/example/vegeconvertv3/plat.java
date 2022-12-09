package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class plat extends AppCompatActivity {

    private ImageView arrowRight;
    private ImageView arrowLeft;
    private ImageView house;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plat);

        //Initialisation
        this.arrowRight = findViewById(R.id.arrow_rightPlat);
        arrowLeft = findViewById(R.id.arrow_leftPlat);
        house =  findViewById(R.id.house);

        //Passer à la page suivante
        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Plat
                if (choix_menu.chemin ==2){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
                //Entree Plat
                if (choix_menu.chemin ==4){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
                //PLat Dessert
                if (choix_menu.chemin ==6){
                    Intent pageDessert = new Intent(getApplicationContext(),dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pageDessert = new Intent(getApplicationContext(),dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
            }
        });

        //Revenir à la page précédente
        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Plat
                if (choix_menu.chemin ==2){
                    Intent pageMenu = new Intent(getApplicationContext(),choix_menu.class);
                    startActivity(pageMenu);
                    finish();
                }
                //Entree Plat
                if (choix_menu.chemin ==4){
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //PLat Dessert
                if (choix_menu.chemin ==6){
                    Intent pageMenu = new Intent(getApplicationContext(),choix_menu.class);
                    startActivity(pageMenu);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
            }
        });

        //Revenir à la page de connection
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
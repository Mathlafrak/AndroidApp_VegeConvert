package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dessert extends AppCompatActivity {

    private ImageView arrowRight;
    private ImageView arrowLeft;
    private ImageView house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        //Initialisation
        this.arrowRight = (ImageView) findViewById(R.id.arrow_right);
        arrowLeft = (ImageView) findViewById(R.id.arrow_left);
        house = (ImageView) findViewById(R.id.house);

        //Passer à la page suivante
        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dessert
                if (choix_menu.chemin ==3){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
                //Entree Dessert
                if (choix_menu.chemin ==5){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
                //PLat Dessert
                if (choix_menu.chemin ==6){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                    startActivity(pageRecette);
                    finish();
                }
            }
        });

        //Revenir à la page précédente
        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Dessert
                if (choix_menu.chemin ==3){
                    Intent pageChoixMenu = new Intent(getApplicationContext(),choix_menu.class);
                    startActivity(pageChoixMenu);
                    finish();
                }
                //Entree Dessert
                if (choix_menu.chemin ==5){
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //PLat Dessert
                if (choix_menu.chemin ==6){
                    Intent pagePlat = new Intent(getApplicationContext(),plat.class);
                    startActivity(pagePlat);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pagePlat = new Intent(getApplicationContext(),plat.class);
                    startActivity(pagePlat);
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
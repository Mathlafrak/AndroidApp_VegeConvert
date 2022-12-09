package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class recette extends AppCompatActivity {

    private ImageView arrowRight;
    private ImageView arrowLeft;
    private ImageView house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recette);

        //Initialisation
        this.arrowRight =  findViewById(R.id.arrow_right);
        arrowLeft =  findViewById(R.id.arrow_left);
        house =  findViewById(R.id.house);

        //Afficher les bonnes zones de texte


        //Afficher les recette


        //Aller à la page suivante
        arrowRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageCourse = new Intent(getApplicationContext(),course.class);
                startActivity(pageCourse);
                finish();
            }
        });
        //Revenir à la page précédente
        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Entree
                if (choix_menu.chemin ==1){
                    Intent pageEntree = new Intent(getApplicationContext(), entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //Plat
                if (choix_menu.chemin ==2){
                    Intent pagePlat = new Intent(getApplicationContext(), plat.class);
                    startActivity(pagePlat);
                    finish();
                }
                //Dessert
                if (choix_menu.chemin ==3){
                    Intent pageDessert = new Intent(getApplicationContext(), dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
                //Entree Plat
                if (choix_menu.chemin ==4){
                    Intent pagePlat = new Intent(getApplicationContext(), plat.class);
                    startActivity(pagePlat);
                    finish();
                }
                //Entree Dessert
                if (choix_menu.chemin ==5){
                    Intent pageDessert = new Intent(getApplicationContext(), dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
                //Plat Dessert
                if (choix_menu.chemin ==6){
                    Intent pageDessert = new Intent(getApplicationContext(), dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pageDessert = new Intent(getApplicationContext(), dessert.class);
                    startActivity(pageDessert);
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
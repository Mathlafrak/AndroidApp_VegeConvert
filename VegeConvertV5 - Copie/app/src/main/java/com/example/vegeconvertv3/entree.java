package com.example.vegeconvertv3;

import static android.media.CamcorderProfile.get;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.ObjectInputStream;
import java.util.ArrayList;


public class entree extends AppCompatActivity {

    public static int entree = 0;

    private ImageView arrowRight;
    private ImageView arrowLeft;
    private ImageView house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entree);

        //Initialisation
        this.arrowRight = findViewById(R.id.arrow_right);
        arrowLeft = findViewById(R.id.arrow_left);
        house =  findViewById(R.id.house);

        //Passer à la page suivante
        arrowRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Entree
                    if (choix_menu.chemin ==1){
                        Intent pageRecette = new Intent(getApplicationContext(),recette.class);
                        startActivity(pageRecette);
                        finish();
                    }
                    //Entree Plat
                    if (choix_menu.chemin ==4){
                        Intent pagePLat = new Intent(getApplicationContext(),plat.class);
                        startActivity(pagePLat);
                        finish();
                    }
                    //Entree Dessert
                    if (choix_menu.chemin ==5){
                        Intent pageDessert = new Intent(getApplicationContext(), dessert.class);
                        startActivity(pageDessert);
                        finish();
                    }
                    //Entree PLat Dessert
                    if (choix_menu.chemin ==7){
                        Intent pagePlat = new Intent(getApplicationContext(), plat.class);
                        startActivity(pagePlat);
                        finish();
                    }
                }
            });

        //Revenir à la page précédente
        arrowLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Entree
                if (choix_menu.chemin ==1){
                    Intent pageChoixMenu = new Intent(getApplicationContext(), choix_menu.class);
                    startActivity(pageChoixMenu);
                    finish();
                }
                //Entree Plat
                if (choix_menu.chemin ==4){
                    Intent pageChoixMenu = new Intent(getApplicationContext(), choix_menu.class);
                    startActivity(pageChoixMenu);
                    finish();
                }
                //Entree Dessert
                if (choix_menu.chemin ==5){
                    Intent pageChoixMenu = new Intent(getApplicationContext(), choix_menu.class);
                    startActivity(pageChoixMenu);
                    finish();
                }
                //Entree PLat Dessert
                if (choix_menu.chemin ==7){
                    Intent pageChoixMenu = new Intent(getApplicationContext(), choix_menu.class);
                    startActivity(pageChoixMenu);
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


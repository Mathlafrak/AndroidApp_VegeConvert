package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class choix_menu extends AppCompatActivity {

    public static int chemin = 0;

    private ImageView arrowRight;
    private ImageView arrowLeft;
    private Button buttonGo;
    private Switch sEntree;
    private Switch sPlat;
    private Switch sDessert;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_menu);

        //Initialisation
        this.arrowRight = findViewById(R.id.arrow_right);
        arrowLeft = findViewById(R.id.arrow_left);
        buttonGo = findViewById(R.id.buttonGo);
        sEntree = findViewById(R.id.switchEntree);
        sPlat = findViewById(R.id.switchPlat);
        sDessert = findViewById(R.id.switchDessert);

        //Retour au Choix regime
        arrowLeft.setOnClickListener(view -> {
            Intent pageRegime = new Intent(getApplicationContext(),choix_regime.class);
            startActivity(pageRegime);
            finish();
        });
        //Aller à la page suivante
        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Entree
                if (sEntree.isChecked() && !(sPlat.isChecked()) && !(sDessert.isChecked())){
                    chemin = 1;
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //Plat
                if (!(sEntree.isChecked()) && sPlat.isChecked() && !(sDessert.isChecked())){
                    chemin = 2;
                    Intent pagePlat = new Intent(getApplicationContext(),plat.class);
                    startActivity(pagePlat);
                    finish();
                }
                //Dessert
                if (!(sEntree.isChecked()) && !(sPlat.isChecked()) && sDessert.isChecked()){
                    chemin = 3;
                    Intent pageDessert = new Intent(getApplicationContext(),dessert.class);
                    startActivity(pageDessert);
                    finish();
                }
                //Entree Plat
                if (sEntree.isChecked() && sPlat.isChecked() && !(sDessert.isChecked())){
                    chemin = 4;
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //Entree Dessert
                if (sEntree.isChecked() && !(sPlat.isChecked()) && sDessert.isChecked()){
                    chemin = 5;
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
                //Plat Dessert
                if (!(sEntree.isChecked()) && sPlat.isChecked() && sDessert.isChecked()){
                    chemin = 6;
                    Intent pagePlat = new Intent(getApplicationContext(),plat.class);
                    startActivity(pagePlat);
                    finish();
                }
                //Entree PLat Dessert
                if (sEntree.isChecked() && sPlat.isChecked() && sDessert.isChecked()){
                    chemin = 7;
                    Intent pageEntree = new Intent(getApplicationContext(),entree.class);
                    startActivity(pageEntree);
                    finish();
                }
            }
        });
    }
}

package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.CharArrayWriter;

public class connection extends AppCompatActivity {
    private Button buttonGoInscription;
    private Button buttonConnect;
    private EditText emailAdress;
    private EditText password;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        //Initalisation
        this.buttonGoInscription = findViewById(R.id.buttongoinscription);
        emailAdress = findViewById(R.id.connectionEmail);
        password = findViewById(R.id.connectionPassword);
        buttonConnect = findViewById(R.id.buttonConnect);

        //Fleche désactiver
        buttonConnect.setEnabled(false);

        //Boutton -> Inscription
        buttonGoInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageInscription = new Intent(getApplicationContext(),inscription.class);
                startActivity(pageInscription);
                finish();
            }
        });

        //Attendre email
        emailAdress.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Attendre password
                password.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // This is where we'll check the user input
                        //On réactive le boutton
                        buttonConnect.setEnabled(!s.toString().isEmpty());
                    }
                });
            }
        });

        //Passer à la page suivante
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageChoixRegime = new Intent(getApplicationContext(),choix_regime.class);
                startActivity(pageChoixRegime);
                finish();
            }
        });

}}
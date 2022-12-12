package com.example.vegeconvertv3;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class connection extends AppCompatActivity{

    private FirebaseAuth Auth;
    private EditText email;
    private EditText password;
    private Button inscription;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        Auth = FirebaseAuth.getInstance();
        final EditText mail = findViewById(R.id.connectionEmail);
        final EditText password = findViewById(R.id.connectionPassword);
        final Button login = findViewById(R.id.buttonConnect);
        final Button Inscription = findViewById(R.id.buttongoinscription);

        Inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), inscription.class);
                startActivity(intent);
                finish();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String mailtxt = mail.getText().toString();
                final String passwordtxt = password.getText().toString();

                if (mailtxt.isEmpty() || passwordtxt.isEmpty()) {
                    Toast.makeText(connection.this, "Please enter your mail or password", Toast.LENGTH_LONG).show();
                } else {
                    login(mailtxt, passwordtxt);
                }
            }
        });
    }
        private void login(String mailtxt, String passwordtxt) {
            Auth.signInWithEmailAndPassword(mailtxt,passwordtxt)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(connection.this, "Logged In", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(connection.this, choix_regime.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(connection.this, "Erreur...", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
    }



package com.example.vegeconvertv3;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;


public class inscription extends AppCompatActivity {

    FirebaseAuth firebaseAuth;


    private Button Inscription;
    private EditText familyName, firstName, email, password;
    private FirebaseAuth Auth;
    FirebaseFirestore firebaseFirestore;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        //Initialisation
        Inscription = (Button) findViewById(R.id.buttonConnectInscription);
        familyName = findViewById(R.id.inscriptionPersonFamilyName);
        firstName = findViewById(R.id.inscriptionPersonFirstName);
        email = findViewById(R.id.inscriptionEmail);
        password = findViewById(R.id.inscriptionPassword);
        Auth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();

        Inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String familyNametxt = familyName.getText().toString();
                String firstNametxt = firstName.getText().toString();
                String emailtxt = email.getText().toString();
                String passwordtxt = password.getText().toString();


                if (TextUtils.isEmpty(familyNametxt) || TextUtils.isEmpty(firstNametxt) || TextUtils.isEmpty(emailtxt) || TextUtils.isEmpty(passwordtxt)) {
                    Toast.makeText(inscription.this, "Remplissez tous les champs", Toast.LENGTH_SHORT).show();
                } else {
                    AjouterUtilisateur(emailtxt, passwordtxt,familyNametxt,firstNametxt);
                }
            }


        });
    }
    private void AjouterUtilisateur(String emailtxt, String passwordtxt,String familyNametxt, String firstNametxt){

        Auth.createUserWithEmailAndPassword(emailtxt,passwordtxt).addOnCompleteListener(inscription.this, new OnCompleteListener<AuthResult>() {
        @Override
        public void onComplete(@NonNull Task<AuthResult> task) {
            if(task.isSuccessful()){
                Toast.makeText(inscription.this, "On y est !", Toast.LENGTH_SHORT).show();
                firebaseFirestore.collection("Utilisateur")
                        .document(FirebaseAuth.getInstance().getUid())
                        .set(new UserModel(familyNametxt,firstNametxt,emailtxt));

                Intent intent = new Intent(inscription.this, connection.class);
                startActivity(intent);
                finish();
            }
            else{
                Toast.makeText(inscription.this, "Erreur...", Toast.LENGTH_SHORT).show();
            }
        }
    });
}
}

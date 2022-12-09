package com.example.vegeconvertv3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.vegeconvertv3.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button buttonConnectInscription;
    private EditText
    private Button buttonTransparent;

    ActivityMainBinding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.buttonConnectInscription = findViewById(R.id.buttonConnectInscription);


    Getdataentree();
    buttonTransparent = findViewById(R.id.buttonTrans);

        buttonTransparent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageConnection = new Intent(getApplicationContext(),connection.class);
                startActivity(pageConnection);
                finish();
            }
        });
    }
    //Appel de la database entree
    public ArrayList<class_entree> Getdataentree(){
        ArrayList<class_entree> list = new ArrayList<>();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("entree")
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        for (QueryDocumentSnapshot document: queryDocumentSnapshots){
                            class_entree recette = document.toObject(class_entree.class);
                            list.add(recette);
                        }
                        Log.d("DATAAA", list.get(0).getNom_recette());
                    }
                });
        return list;
    }

}

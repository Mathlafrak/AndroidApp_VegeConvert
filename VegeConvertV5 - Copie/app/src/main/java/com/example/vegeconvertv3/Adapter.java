package com.example.vegeconvertv3;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<class_entree> {
    public Adapter(@NonNull Context context, ArrayList<class_entree> entreeArrayList) {
        super(context, 0, entreeArrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // below line is use to inflate the
        // layout for our item of list view.
        View listitemView = convertView;
        if (listitemView == null) {
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        // after inflating an item of listview item
        // we are getting data from array list inside
        class_entree entree = getItem(position);

        // initializing our UI components of list view item.
        TextView Nom = listitemView.findViewById(androidx.appcompat.R.id.custom);


        // after initializing our items we are
        // setting data to our view.
        // below line is use to set data to our text view.
        Nom.setText(entree.getNom_recette());


        // below line is use to add item click listener
        // for our item of list view.
        listitemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Item clicked is : " + entree.getNom_recette(), Toast.LENGTH_SHORT).show();

            }
        });
        return listitemView;
    }

}

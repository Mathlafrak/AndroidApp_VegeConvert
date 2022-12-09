package com.example.vegeconvertv3;

public class class_entree {
    private String nom_recette, ingredient, recette;

    public class_entree(String nom, String ingredient, String recette) {
        this.nom_recette = nom;
        this.ingredient = ingredient;
        this.recette = recette;
    }

    public class_entree(){}

    public String getNom_recette() {
        return nom_recette;
    }

    public void setNom_recette(String nom_recette) {
        this.nom_recette = nom_recette;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getRecette() {
        return recette;
    }

    public void setRecette(String recette) {
        this.recette = recette;
    }
}

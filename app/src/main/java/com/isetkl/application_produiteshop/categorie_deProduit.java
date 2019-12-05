package com.isetkl.application_produiteshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class categorie_deProduit extends AppCompatActivity {
   ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie_de_produit);

        listView = findViewById(R.id.listView);

        ArrayList<Integer> images = new ArrayList();
        images.add(R.drawable.i10);
        images.add(R.drawable.i1);
        images.add(R.drawable.i2);
        images.add(R.drawable.i3);
        images.add(R.drawable.i6);
        images.add(R.drawable.i5);
        images.add(R.drawable.i8);
        images.add(R.drawable.i7);
        images.add(R.drawable.i9);



        ArrayList<String> Texte = new ArrayList();
        Texte.add(getResources().getString(R.string.huile));
        Texte.add(getResources().getString(R.string.coifure));
        Texte.add(getResources().getString(R.string.manucure));
        Texte.add(getResources().getString(R.string.maquillage));
        Texte.add(getResources().getString(R.string.parfume));
        Texte.add(getResources().getString(R.string.produits));
        Texte.add(getResources().getString(R.string.soinc));
        Texte.add(getResources().getString(R.string.soint));
        Texte.add(getResources().getString(R.string.sante));

        Adapter_categorie adapter_recherche = new Adapter_categorie(this, images, Texte);
        listView.setAdapter(adapter_recherche);
    }
}

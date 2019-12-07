package com.isetkl.application_produiteshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        Texte.add("huile");
        Texte.add("coifure");
        Texte.add("manucure");
        Texte.add("maquillage");
        Texte.add("parfum");
        Texte.add("produit solaire");
        Texte.add("soi de visage et corps");
        Texte.add("soi toillet bebe");
        Texte.add("santé");


        Adapter_categorie adapter_recherche = new Adapter_categorie(this, images, Texte);
        listView.setAdapter(adapter_recherche);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent newActivity = new Intent(categorie_deProduit.this,typehuile.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(categorie_deProduit.this,typecoiffure.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(categorie_deProduit.this, typemanucure.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(categorie_deProduit.this, typemaquillage.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(categorie_deProduit.this, typeparfume.class);
                        startActivity(newActivity4);
                        break;

                }
            }
        });
    }


}

package com.isetkl.application_produiteshop;

import androidx.appcompat.app.AppCompatActivity;
<<<<<<< HEAD

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
=======
import android.content.Intent;
import android.os.Bundle;
>>>>>>> produitShop/master
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
<<<<<<< HEAD
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

=======
>>>>>>> produitShop/master
import java.util.ArrayList;
import java.util.HashMap;


public class huilevisage extends AppCompatActivity {
    protected ListView maListViewPerso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huilevisage);

        // Récupération de la "ListView" créée dans le fichier activity_main.xml
        maListViewPerso = findViewById(R.id.listviewperso);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"
        map = new HashMap<>();
        // On insère la "référence" à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans le "ImageView" créé dans le fichier affichage_item.xml
        map.put("img", String.valueOf(R.drawable.hv1));
        // On insère un élément "titre" que l'on récupérera dans le "TextView titre" créé dans le fichier affichage_item.xml
        map.put("titre", "Huile Bio Noble");


        // Enfin on ajoute cette "HashMap" dans la "ArrayList"
        listItem.add(map);

        // On refait la manip plusieurs fois avec des données différentes pour former les items de notre "ListView"

        map = new HashMap<>();
        map.put("titre", "Huile visage présieuse bio");

        map.put("img", String.valueOf(R.drawable.hv4));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Huile visage jojoba");

        map.put("img", String.valueOf(R.drawable.hv3));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Huile visage glory oil 30ml");

        map.put("img", String.valueOf(R.drawable.hv5));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Huile visage naturelle");

        map.put("img", String.valueOf(R.drawable.hv2));
        listItem.add(map);







        // Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre liste (listItem) dans la vue affichage_item
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.huilevisage,
                new String[]{"img","titre"},
                new int[]{R.id.img,R.id.titre});

        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);
        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent newActivity = new Intent(huilevisage.this,huile_noble.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(huilevisage.this,huilecorps.class);
                        startActivity(newActivity1);
                        break;
                }
            }
        });

<<<<<<< HEAD
      
=======

>>>>>>> produitShop/master

    }
}
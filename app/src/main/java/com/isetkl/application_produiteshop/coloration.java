package com.isetkl.application_produiteshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class coloration extends AppCompatActivity {
    protected ListView maListViewPerso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloration);

        // Récupération de la "ListView" créée dans le fichier activity_main.xml
        maListViewPerso = findViewById(R.id.listviewperso);

        // Création de la "ArrayList" qui nous permettra de remplir la "ListView"
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();

        // On déclare la "HashMap" qui contiendra les informations pour un item
        HashMap<String, String> map;

        // Création d'une "HashMap" pour insérer les informations du premier item de notre "ListView"
        map = new HashMap<>();
        // On insère la "référence" à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans le "ImageView" créé dans le fichier affichage_item.xml
        map.put("img", String.valueOf(R.drawable.lo1));
        // On insère un élément "titre" que l'on récupérera dans le "TextView titre" créé dans le fichier affichage_item.xml
        map.put("titre", "tientur l'orial");


        // Enfin on ajoute cette "HashMap" dans la "ArrayList"
        listItem.add(map);

        // On refait la manip plusieurs fois avec des données différentes pour former les items de notre "ListView"

        map = new HashMap<>();
        map.put("titre", "tientur framcolor");

        map.put("img", String.valueOf(R.drawable.lo2));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "tientur techno");

        map.put("img", String.valueOf(R.drawable.lo3));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre","tientur garnier");

        map.put("img", String.valueOf(R.drawable.lo4));
        listItem.add(map);


        // Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre liste (listItem) dans la vue affichage_item
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.coloration,
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
                        Intent newActivity = new Intent(coloration.this,confirme_color1.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(coloration.this,confirme_color2.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(coloration.this,confirme_color3.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(coloration.this,confirme_color4.class);
                        startActivity(newActivity3);
                        break;

                }
            }
        });



    }

}

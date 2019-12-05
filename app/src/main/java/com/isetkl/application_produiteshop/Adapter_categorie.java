package com.isetkl.application_produiteshop;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class Adapter_categorie extends ArrayAdapter{

        private ArrayList image;
        private ArrayList texte;

        public Adapter_categorie(Context context, ArrayList image, ArrayList texte)
        {
            super(context, 0, texte);
            this.image = image;
            this.texte = texte;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            if (convertView == null)
            {
                convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_categorie_de_produit,parent,false);
            }


            TextView textView1 = convertView.findViewById(R.id.item_texte);
            ImageView imageView = convertView.findViewById(R.id.item_image);


            textView1.setText((String)texte.get(position));
            imageView.setImageResource((Integer)image.get(position));

            return convertView;
        }
    }




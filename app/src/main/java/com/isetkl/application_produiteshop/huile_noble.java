package com.isetkl.application_produiteshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class huile_noble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
        setContentView(R.layout.activity_huile_noble);
=======
        setContentView(R.layout.activity_main);
>>>>>>> produitShop/master

        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                startActivity(new Intent(huile_noble.this,formulaire_inscri.class));
=======
                startActivity(new Intent(huile_noble.this,confirmation.class));
>>>>>>> produitShop/master

            }
        });

    };
}

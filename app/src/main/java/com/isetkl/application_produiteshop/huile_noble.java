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

        setContentView(R.layout.activity_huile_noble);

        setContentView(R.layout.activity_main);


        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(huile_noble.this,formulaire_inscri.class));

                startActivity(new Intent(huile_noble.this,confirmation.class));


            }
        });

    };
}

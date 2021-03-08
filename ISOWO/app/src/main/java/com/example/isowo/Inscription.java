package com.example.isowo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inscription extends AppCompatActivity {

    private Button inscription, connection;
    private EditText prenom, mdp,pseudo,mdpconf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        connection = findViewById(R.id.btnConnection);
        inscription = findViewById(R.id.btnInscription);
        prenom = findViewById(R.id.prenom);
        pseudo = findViewById(R.id.pseudo);
        mdp = findViewById(R.id.mdp);
        mdpconf = findViewById(R.id.mdpconf);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inscription.this,Home.class);
                startActivity(i);
                finish();
            }
        });

        connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Inscription.this,Connexion.class);
                startActivity(i);
                finish();
            }
        });
    }
}
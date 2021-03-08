package com.example.isowo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Connexion extends AppCompatActivity {

    private Button inscription, connection;
    private EditText nom, mdp ;
    private TextView mdpfg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        connection = (Button) findViewById(R.id.btnConnection);
        inscription = (Button)findViewById(R.id.btnInscription);
        nom = (EditText) findViewById(R.id.nom);
        mdp = (EditText) findViewById(R.id.mdp);
        mdpfg = (TextView) findViewById(R.id.mdpforget);


        connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Connexion.this,Home.class);
                startActivity(i);
                finish();
            }
        });
        
        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Connexion.this,Inscription.class);
                startActivity(i);
                finish();
            }
        });

        mdpfg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Connexion.this,ConnexionMdpForget.class);
                startActivity(i);
                finish();
            }
        });

    }
}
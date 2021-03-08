package com.example.isowo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConnexionMdpForget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion_mdp_forget);

        findViewById(R.id.btnnum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConnexionMdpForget.this,ConnexionConfirmationActivity.class);
                startActivity(i);
                finish();
            }
        });

        findViewById(R.id.btnmail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConnexionMdpForget.this, ConnexionConfirmationActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
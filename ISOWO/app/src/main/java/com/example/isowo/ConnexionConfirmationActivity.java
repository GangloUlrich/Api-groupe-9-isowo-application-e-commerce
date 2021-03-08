package com.example.isowo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConnexionConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_confirmation);

        findViewById(R.id.btnlast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ConnexionConfirmationActivity.this,ConnexionResetActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
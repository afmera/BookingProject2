package com.example.bookingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opcions_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcions_);
        this.setTitle(R.string.main_menu);

        Button btn_email = (Button) findViewById(R.id.correo_button);
        Button btn_google = (Button) findViewById(R.id.google_button);
        Button btn_phone = (Button) findViewById(R.id.number_phone_button);
        Button btn_salir = (Button) findViewById(R.id.exit_button);

        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Opcions_Activity.this, Email_Activity.class);
                startActivity(intent);
            }
        });

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcions_Activity.this, Google_Activity.class);
                startActivity(intent);
            }
        });

        btn_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Opcions_Activity.this, Phone_Activity.class);
                startActivity(intent);
            }
        });

        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

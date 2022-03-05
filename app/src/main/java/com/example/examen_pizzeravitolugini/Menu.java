package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    ImageView ima1;
    ImageView ima2;

    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ima1 = findViewById(R.id.ima1);
        ima2 = findViewById(R.id.imageView2);
        text1 = (TextView) findViewById(R.id.text1);

        ima1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,MenuComida.class);
                startActivity(intent);
            }
        });

        ima2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,MenuBebidas.class);
                startActivity(intent);
            }
        });

        String dato =getIntent().getStringExtra("dato");
        text1.setText("Hola mi Estimado "+ dato + " ¿qué te podemos llevar hasta tu casa este día? Por favor selecciona:");


    }
}
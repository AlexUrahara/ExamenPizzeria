package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        text1 = (TextView) findViewById(R.id.text1);

        String dato =getIntent().getStringExtra("dato");
        text1.setText("Hola mi Estimado "+ dato + " ¿qué te podemos llevar hasta tu casa este día? Por favor selecciona:");

    }
}
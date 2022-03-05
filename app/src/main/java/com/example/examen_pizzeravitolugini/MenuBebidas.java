package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuBebidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bebidas);
    }

    public void volver (View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}
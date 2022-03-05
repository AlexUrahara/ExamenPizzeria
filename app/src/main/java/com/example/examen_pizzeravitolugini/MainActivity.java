package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText text0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text0 = (EditText) findViewById(R.id.text0);
    }
    public void Login(View view){
        Intent i = new Intent(this, Menu.class);
        i.putExtra("dato", text0.getText().toString());
        startActivity(i);
    }
}
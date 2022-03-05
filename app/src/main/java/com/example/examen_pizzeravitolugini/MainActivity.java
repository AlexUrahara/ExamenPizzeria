package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText text0;
    Button login;
    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text0 = (EditText) findViewById(R.id.text0);
        login = (Button) findViewById(R.id.button1);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View view){
        Intent i = new Intent(getApplicationContext(), Menu.class);
        preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user",text0.getText().toString());
        editor.commit();
        startActivity(i);
    }
});
    }
}
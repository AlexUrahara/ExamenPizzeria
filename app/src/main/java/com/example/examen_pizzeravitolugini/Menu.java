package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    ImageView ima1;
    ImageView ima2;
    String usuario;
    SharedPreferences preferences;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ima1 = findViewById(R.id.ima1);
        ima2 = findViewById(R.id.imageView2);
        text1 = (TextView) findViewById(R.id.text1);
        usuario="";

        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            if(extras.get("user")!=null){
                usuario=extras.get("user").toString();
            }else
                Toast.makeText(getApplicationContext(),"No existe user",Toast.LENGTH_LONG).show();

        }else
            Toast.makeText(getApplicationContext(),"Entrando",Toast.LENGTH_LONG).show();


        preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        usuario=preferences.getString("user","No existe el usuario");

        text1.setText("Bienvenido mi estimado "+usuario+" ¿Que te Podemos Llevar a tu Casa Este Bello Día?");


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


    }

}
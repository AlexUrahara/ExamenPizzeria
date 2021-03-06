package com.example.examen_pizzeravitolugini;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MenuComida extends AppCompatActivity {
    Button button3;
    Button button2;
    TextView text2;
    RadioButton Radio1, Radio2, Radio3;
    EditText text0;
    String usuario;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_comida);
        button3 = findViewById(R.id.button3);
        Radio1 = (RadioButton) findViewById(R.id.radio1);
        Radio2 = (RadioButton) findViewById(R.id.radio2);
        Radio3 = (RadioButton) findViewById(R.id.radio3);
        text2 = (TextView) findViewById(R.id.text2);
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

        text2.setText(usuario+" Selecciona una de Nuestras Mejores Pizzas del Día");


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuComida.this, MenuBebidas.class);
                startActivity(intent);
            }
        }); }
    public void pagarComida(View view) {

        if (Radio1.isChecked() == true) {
            Intent i = new Intent(this, FinalizarCompra.class);
            i.putExtra("dato2", Radio1.getText().toString());
            startActivity(i);
        } else {
            if (Radio2.isChecked() == true) {
                Intent i = new Intent(this, FinalizarCompra.class);
                i.putExtra("dato2", Radio2.getText().toString());
                startActivity(i);
            } else {
                if (Radio3.isChecked() == true) {
                    Intent i = new Intent(this, FinalizarCompra.class);
                    i.putExtra("dato2", Radio3.getText().toString());
                    startActivity(i);
                }
            }
        }
    }
    public void volver(View view) {
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }

}
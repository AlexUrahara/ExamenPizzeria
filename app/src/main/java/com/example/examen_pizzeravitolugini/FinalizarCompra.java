package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FinalizarCompra extends AppCompatActivity {
    TextView text3;
    Button Salir;
    String usuario;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);

        text3 = (TextView) findViewById(R.id.text3);
        Salir=(Button) findViewById(R.id.salir);
        usuario="";

        Bundle extras = getIntent().getExtras();
        if(extras!= null){
            if(extras.get("user")!=null){
                usuario=extras.get("user").toString();
            }else
                Toast.makeText(getApplicationContext(),"Excelente!",Toast.LENGTH_LONG).show();

        }else
            Toast.makeText(getApplicationContext(),"Finalizando",Toast.LENGTH_LONG).show();

        preferences=getSharedPreferences("credenciales", Context.MODE_PRIVATE);
        usuario=preferences.getString("user","No existe el usuario");





        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Saliendo de la Aplicación", Toast.LENGTH_LONG).show();
                Log.i("ERROR4","hiciste clic en salir");
                finish();


                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


        String dato =getIntent().getStringExtra("dato1");
        String dato2 =getIntent().getStringExtra("dato2");
        String dato3 =getIntent().getStringExtra("dato3");
        String dato4 =getIntent().getStringExtra("dato4");
        text3.setText("Estimado "+ usuario +" escogiste la : " + dato2 + " acompañada de la bebida: " + dato3 +" su total a pagar es: " + dato4);



    }
    public void volver (View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}





package com.example.examen_pizzeravitolugini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FinalizarCompra extends AppCompatActivity {
    private TextView text3;
    Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);

        text3 = (TextView) findViewById(R.id.text3);
        Salir=(Button) findViewById(R.id.salir);

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
        text3.setText("Estimado "+ dato +"  has seleccionado la: " + dato2 + " acompañada de la bebida: " + dato3 +" su total a pagar es: " + dato4);



    }
    public void volver (View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}





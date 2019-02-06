package com.example.estudiantes.clasepoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Poo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poo);
    }

    public void Buscar (View view){

        TextView MiMensaje =(TextView) findViewById(R.id.mensaje);
        EditText MiSalon=(EditText) findViewById(R.id.salon);
        Button Click=(Button)findViewById(R.id.click);

        String Buscador=MiSalon.getText().toString();
        if (Buscador.equals("201")){
            MiMensaje.setText("Segundo Piso Edificio Sabio Caldas, Sede la 40");
        }else{
            MiMensaje.setText("error!!!");
        }
    }
}

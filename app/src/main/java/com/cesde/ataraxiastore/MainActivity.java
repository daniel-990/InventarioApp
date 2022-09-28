package com.cesde.ataraxiastore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nombreP;
    EditText cantidadP;
    Button agragarCampo;
    Button guardarP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardarP.findViewById(R.id.guardarP);
        agragarCampo.findViewById(R.id.agragarCampo);
        cantidadP.findViewById(R.id.cantidadP);
        nombreP.findViewById(R.id.nombreP);

        //-----
        guardarP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nombreP.setText("Ingreso de datos");
            }
        });


    }

/*
    public void Guardar(new View.OnClickListener(){


        //int ValorT = (C * pC) + (G * pG) + (B * pB) + (K * pK) + (V * pV);
        //ValorTotal.setText(String.valueOf(ValorT));

    });
*/

    /*
    public void Agregar(View v){

    }
    */


}








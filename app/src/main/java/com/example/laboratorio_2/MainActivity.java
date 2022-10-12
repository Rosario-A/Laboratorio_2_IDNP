// Clase MainActivity
package com.example.laboratorio_2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText  aPaterno,aMaterno,nombres,fecNacimiento,colProcedencia,Postula;
    Button registrar, mostrar;
    ArrayList<Alumno> registrados = new ArrayList<>();
    Alumno auxAlum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aPaterno = (EditText) findViewById(R.id.aPaterno);
        aMaterno = (EditText) findViewById(R.id.aMaterno);
        nombres = (EditText) findViewById(R.id.nombres);
        fecNacimiento = (EditText)  findViewById(R.id.fecha);
        colProcedencia = (EditText) findViewById(R.id.colegio);
        Postula = (EditText) findViewById(R.id.carrera);

        registrar = (Button) findViewById(R.id.button1);
        mostrar = (Button) findViewById(R.id.button2);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auxAlum = new Alumno(aPaterno.getText().toString(), aMaterno.getText().toString(),nombres.getText().toString()
                        ,fecNacimiento.getText().toString(),colProcedencia.getText().toString(),Postula.getText().toString());
                registrados.add(auxAlum);
                //System.out.println("Alumno Guardado" + auxAlum + "!");
                Log.d(TAG, "Alumno registrado con exito "+auxAlum+"!");
                aPaterno.setText("");
                aMaterno.setText("");
                nombres.setText("");
                fecNacimiento.setText("");
                colProcedencia.setText("");
                Postula.setText("");
            }
        });
        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int x = 0; x < registrados.size(); x++) {
                    Alumno auxAlumno = registrados.get(x);
                    //  System.out.println(auxAlumno);
                    Log.d(TAG, "Alumno Registrado "+ (x+1) +": "+auxAlumno);
                }
            }
        });
    }
}
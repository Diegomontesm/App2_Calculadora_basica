package com.example.a2_calculadora_basica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // HECHO POR DIEGO ÁNGEL MONTES MORENO
    //DECLARAMOS DE MANERA PRIVADA LOS BOTONES A USAR
    private Button BTN_Suma;
    private Button BTN_Resta;
    private Button BTN_Division;
    private Button BTN_Multiplicacion;
    private Button BTN_Borrar;
    //DECLARAMOS EL TEXTVIEW DONDE SE GUARDARÁ LA RESPUESTA Y LOS DOS EDITTEXT QUE SERÁN DONDE
    //SE INTRODUCIRÁN LOS NÚMEROS
    private TextView textView_respuesta;
    private EditText editText_numero1;
    private EditText editText_numero2;


    //LOS METODOS A USAR PARA LA FUNCIÓN LÓGICA DE LA CALCULADORA: SUMA, RESTA, MULT Y DIV
    //FUNCIÓN SUMA
    public double Suma(int a, int b) {
        return a + b;
    }

    //FUNCION RESTA
    public double Resta(int a, int b) {
        return a - b;
    }

    //FUNCION MULTIPLICACIÓN
    public double Multiplicacion(int a, int b) {
        return a * b;
    }

    //FUNCIÓN DIVISIÓN
    public double Division (int a, int b){

        int respuesta = 0;
        if (b!=0){
            respuesta = a/b;
        } return respuesta;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INSTANCIAMOS EL TEXTCIEW Y EL EDITTEXT
        textView_respuesta = findViewById(R.id.respuesta);
        editText_numero1 = findViewById(R.id.numero1);
        editText_numero2 = findViewById((R.id.numero2));

        // INSTANCIAMOS LOS BOTONES Y LOS ASOCIAMOS A CADA FUNCION
        BTN_Suma = findViewById(R.id.button_suma);
        //ASOCIARLO CON setOnClickListener
        BTN_Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_respuesta.setText(Suma(Integer.parseInt(editText_numero1.getText().toString()), Integer.parseInt(editText_numero2.getText().toString())) + "");
                //AGREGAMOS EL + "" PORQUE ANDROID STUDIO MARCA ERROR EN TIEMPO DE EJECUCIÓN ->
            }
        });


        BTN_Resta = findViewById(R.id.button_resta);
        BTN_Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_respuesta.setText(Resta(Integer.parseInt(editText_numero1.getText().toString()), Integer.parseInt(editText_numero2.getText().toString())) + "");
            }
        });

        BTN_Division = findViewById(R.id.button_division);
        BTN_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_respuesta.setText(Division(Integer.parseInt(editText_numero1.getText().toString()), Integer.parseInt(editText_numero2.getText().toString())) + "");
            }
        });

        BTN_Multiplicacion = findViewById(R.id.button_multiplicacion);
        BTN_Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_respuesta.setText(Multiplicacion(Integer.parseInt(editText_numero1.getText().toString()), Integer.parseInt(editText_numero2.getText().toString())) + "");
            }
        });

        BTN_Borrar = findViewById(R.id.BTN_Borrar);
        BTN_Borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView_respuesta.setText("");
                editText_numero1.setText("");
                editText_numero2.setText("");
            }
        });
    }
}

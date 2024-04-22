package com.example.myapplication;

import static com.example.myapplication.R.id.displayText;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import calculator.Calculator;

public class MainActivity extends AppCompatActivity {
public void sumar(View view){
    Log.i("app","funciona");
    TextView displayText =  findViewById(R.id.displayText);
    displayText.setText(R.string.Sumar);

}

    public void restar(View view){
        Log.i("app","funciona");
        TextView displayText =  findViewById(R.id.displayText);
        displayText.setText(R.string.restar);

    }
    public void multiplicar(View view){
        Log.i("app","funciona");
        TextView displayText =  findViewById(R.id.displayText);
        displayText.setText(R.string.multiplicar);

    }
    public void dividir(View view){
        Log.i("app","funciona");
        TextView displayText =  findViewById(R.id.displayText);
        displayText.setText(R.string.dividir);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
          TextView displayText =  findViewById(R.id.displayText);
           displayText.setText("probando pantalla");
        Calculator calculator = new Calculator();
        calculator.sumar(1,2);
        calculator.dividision(100,51);

     calculator.restar(10,5);


        }
    }

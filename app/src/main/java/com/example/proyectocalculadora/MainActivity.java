package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    double n1, n2, resultado;
    String Operador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bCero(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "0");
    }

    public void bUno(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "1");
    }

    public void bDos(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "2");
    }

    public void bTres(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "3");
    }

    public void bCuatro(View view){
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "4");
    }

    public void bCinco(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "5");
    }

    public void bSeis(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "6");
    }

    public void bSiete(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "7");
    }

    public void bOcho(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "8");
    }

    public void bNueve(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "9");
    }

    public void bPunto(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + ".");
    }

    public void bPorcentaje(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText(tvDisplay.getText() + "%");
    }

    public void ObtenerNumero1(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        n1 = Double.parseDouble(tvDisplay.getText().toString());
        //tvDisplay.setText( n1 + " " + Operador );
        tvDisplay.setText(" ");
    }

    public void ObtenerNumero2(View view)
    {
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        n2 = Double.parseDouble(tvDisplay.getText().toString());
        //tvDisplay.setText( n2 + " " + Operador );
        tvDisplay.setText(" ");
    }

    public void Sumar(View view)
    {
        Operador = "+";
        ObtenerNumero1(view);
    }

    public void Restar(View view)
    {
        Operador = "-";
        ObtenerNumero1(view);
    }

    public void Multiplicar(View view)
    {
        Operador = "*";
        ObtenerNumero1(view);
    }

    public void Dividir(View view)
    {
        Operador = "/";
        ObtenerNumero1(view);
    }

    public void  bIgual(View view){
        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        n2 = Double.parseDouble(tvDisplay.getText().toString());
        switch (Operador)
        {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            default:
                Toast.makeText(this, "Opción invalida", Toast.LENGTH_SHORT);
        }

        tvDisplay.setText(" " + resultado);
    }

    public void BorrarTodo(View view)
    {
        n1 = 0.0;
        n2 = 0.0;

        tvDisplay = (TextView) findViewById(R.id.tvResultados);
        tvDisplay.setText("");
    }


}
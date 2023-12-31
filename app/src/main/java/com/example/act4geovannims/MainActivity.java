package com.example.act4geovannims;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumero1, etNumero2, etNumero3;
    private TextView ftNumeroMayor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        etNumero3 = findViewById(R.id.etNumero3);
        ftNumeroMayor = findViewById(R.id.ftNumeroMayor);
    }


    public void calcularMayor(View view) {
        int numero1 = Integer.parseInt(etNumero1.getText().toString());
        int numero2 = Integer.parseInt(etNumero2.getText().toString());
        int numero3 = Integer.parseInt(etNumero3.getText().toString());

        int mayor = Math.max(numero1, Math.max(numero2, numero3));

        ftNumeroMayor.setText("El número mayor es: " + mayor);
    }
}
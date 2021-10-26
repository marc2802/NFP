package com.example.nfp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextava1;
    private EditText editTextava2;
    private EditText editTextprova;
    private TextView textviewa1;
    private TextView textviewa2;
    private TextView textviewresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextava1 = findViewById(R.id.editTextava1);
        editTextava2 = findViewById(R.id.editTextava2);
        editTextprova = findViewById(R.id.editTextprova);

    }

    public void calcularmedia(View view) {
        double ava1 = Double.parseDouble(editTextava1.getText().toString());
        double ava2 = Double.parseDouble(editTextava2.getText().toString());
        double prova = Double.parseDouble(editTextprova.getText().toString());

        double resultadoa1 = (ava1 * 4 + ava2 * 4) / 10;
        double resultadoprova = (prova * 6) / 10;
        double nfp = resultadoa1 + resultadoprova;
        double textviewa1 = resultadoa1;
        double textviewa2 = resultadoprova;

        if (nfp >= 6) {

            textviewresultado.setText("APROVADO! NFp = "+nfp);

        }else if (nfp <= 5.9) {

            textviewresultado.setText("REPROVADO NFp = "+nfp);


        }


    }
}
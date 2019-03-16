package com.example.aluno.agua;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular;
    EditText edtConsumo;
    double excedente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtConsumo = findViewById(R.id.edtConsumo);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double edtConsumoValue = Double.parseDouble(edtConsumo.getText().toString());

                excedente = edtConsumoValue - 10;

                Context contexto = getApplicationContext();
                int duracao = Toast.LENGTH_SHORT;
                String texto = "";

                double totalPago = 0;
                if (edtConsumoValue > 100) {
                    double acima = edtConsumoValue - 100;
                    totalPago = acima * 5;
                    edtConsumoValue = edtConsumoValue - acima;
                    System.out.println("aaa4:" + (acima * 5));
                }
                if (edtConsumoValue >= 31) {
                    double acima = edtConsumoValue - 30;
                    totalPago = totalPago + (acima * 2);
                    edtConsumoValue = edtConsumoValue - acima;
                    System.out.println("aaa3:" + (acima * 2));
                }
                if (edtConsumoValue > 10) {
                    double acima = edtConsumoValue - 10;
                    totalPago = totalPago + (acima);
                    edtConsumoValue = edtConsumoValue - acima;
                    System.out.println("aaa2:" + acima);
                }
                if (edtConsumoValue <= 10) {
                    totalPago = totalPago + 7;
                    System.out.println("aaa1:" + 7);

                }

                /*else if (consumo > 10 && consumo <= 30) {
                    7 + execedente){
                    else if (consumo > 30 && consumo <= 100 {
                        27 + excedente * 2
                    } else if (consumo > 100 && consumo <= 120) {
                        167 + excedente * 5
                    }*/

                    texto = "Valor total:" + totalPago;
                    Toast toast = Toast.makeText(contexto, texto, duracao);
                    toast.show();


                }
            });

        }
    }

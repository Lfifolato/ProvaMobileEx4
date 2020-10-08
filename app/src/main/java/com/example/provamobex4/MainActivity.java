package com.example.provamobex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    TextView txtNum, txtPar, txtDobro, txtRaiz;

    Button btnCalcular, btnLimpar;

    double Num, Res1, Res2, Res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum = (TextView) findViewById(R.id.txtNum);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum.setText("");
                txtDobro.setText("");
                txtRaiz.setText("");
                txtPar.setText("");
            }
        });

        btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtNum = (TextView) findViewById(R.id.txtNum);
                txtDobro = (TextView) findViewById(R.id.txtDobro);
                txtPar = (TextView) findViewById(R.id.txtPar);
                txtRaiz = (TextView) findViewById(R.id.txtRaiz);

                Num = Double.parseDouble(txtNum.getText().toString());

                //Dobro
                Res1 = Num * 2;
                txtDobro.setText(String.valueOf(Res1));

                //E Par
                Res2 = Num % 2;
                if(Res2 == 0)
                {
                    txtPar.setText("Par");
                }
                else
                {
                    txtPar.setText("Impar");
                }

                Res3 = sqrt(Num);
                txtRaiz.setText(String.format("%.2f",Res3));

            }
        });

    }
}
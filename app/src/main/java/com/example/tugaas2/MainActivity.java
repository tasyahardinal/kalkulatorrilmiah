package com.example.tugaas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnsin;
    private Button btncos;
    private Button btntan;
    private Button btncsc;
    private Button btncot;
    private Button btnsec;
    private Button btnlog;
    private EditText etangka;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsin = findViewById(R.id.sin);
        btncos = findViewById(R.id.cos);
        btntan = findViewById(R.id.tan);
        btncsc = findViewById(R.id.csc);
        btnsec = findViewById(R.id.sec);
        btncot = findViewById(R.id.cot);
        btnlog = findViewById(R.id.log);
        etangka = findViewById(R.id.angka);
        tvhasil = findViewById(R.id.hasil);

        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSin = etangka.getText().toString();

                    double dSin = Double.parseDouble(sSin);

                    double sin = Math.sin(dSin);
                    String sHasil = String.valueOf(sin);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCos = etangka.getText().toString();

                    double dCos = Double.parseDouble(sCos);

                    double cos = Math.cos(dCos);
                    String sHasil = String.valueOf(cos);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sTan = etangka.getText().toString();

                    double dTan = Double.parseDouble(sTan);

                    double cos = Math.tan(dTan);
                    String sHasil = String.valueOf(cos);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCsc = etangka.getText().toString();

                    double dCsc = Double.parseDouble(sCsc);

                    double cos = 1.0/Math.sin(dCsc);
                    String sHasil = String.valueOf(cos);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSec = etangka.getText().toString();

                    double dSec = Double.parseDouble(sSec);

                    double cos = 1.0/Math.cos(dSec);
                    String sHasil = String.valueOf(cos);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCot = etangka.getText().toString();

                    double dCot = Double.parseDouble(sCot);

                    double cot = 1.0/Math.tan(dCot);
                    String sHasil = String.valueOf(cot);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sLog = etangka.getText().toString();

                    double dLog = Double.parseDouble(sLog);

                    double log = Math.log10(dLog);
                    String sHasil = String.valueOf(log);
                    tvhasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "FIELD TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
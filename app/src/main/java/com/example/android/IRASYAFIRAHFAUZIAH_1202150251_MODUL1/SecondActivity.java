package com.example.android.IRASYAFIRAHFAUZIAH_1202150251_MODUL1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView harga;
    TextView uduk;
    TextView jmlh;
    TextView lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String hJmlh = intent.getStringExtra("jumlah");
        String hLokasi = intent.getStringExtra("lokasi");
        String hNasi = intent.getStringExtra("menu");
        String hHarga = intent.getStringExtra("harga");

        int total = Integer.valueOf(hHarga)*Integer.valueOf(hJmlh);

        lokasi = (TextView)findViewById(R.id.textView4);
        lokasi.setText(hLokasi);

        uduk = (TextView)findViewById(R.id.textView6);
        uduk.setText(hNasi);

        jmlh = (TextView)findViewById(R.id.textView8);
        jmlh.setText(hJmlh);

        harga =(TextView)findViewById(R.id.textView10);
        harga.setText(String.valueOf(total));

        if (total > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}

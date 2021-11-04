package com.example.apoieruas;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class fale_conosco extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fale_conosco);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("FALE CONOSCO");


        androidx.appcompat.widget.AppCompatButton facebookbtn = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.facebookbtn);
        facebookbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100060867214118")));
            }
        });

        androidx.appcompat.widget.AppCompatButton instabtn = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.instabtn);
        instabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/apoie.ruas?utm_medium=copy_link")));
            }
        });


    }


}
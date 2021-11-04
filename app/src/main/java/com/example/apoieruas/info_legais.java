package com.example.apoieruas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class info_legais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_legais);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("INFORMAÇÕES LEGAIS");

        //Política de Privacidade
        RelativeLayout politicadeprivacidade = (RelativeLayout) findViewById(R.id.politicadeprivacidade);
        politicadeprivacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,politica.class);
                startActivity(intent);
            }
        });

        TextView texto_politicadeprivacidade = (TextView) findViewById(R.id.texto_politicadeprivacidade);
        texto_politicadeprivacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,politica.class);
                startActivity(intent);
            }
        });

        androidx.appcompat.widget.AppCompatButton btn_politicadeprivacidade = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btn_politicadeprivacidade);
        btn_politicadeprivacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,politica.class);
                startActivity(intent);
            }
        });

        //Licença de Software
        RelativeLayout software = (RelativeLayout) findViewById(R.id.software);
        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,software.class);
                startActivity(intent);
            }
        });

        TextView texto_software = (TextView) findViewById(R.id.texto_software);
        texto_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,software.class);
                startActivity(intent);
            }
        });

        androidx.appcompat.widget.AppCompatButton btn_software = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btn_software);
        btn_software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(info_legais.this,software.class);
                startActivity(intent);
            }
        });

    }
}


package com.example.apoieruas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class faq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("PERGUNTAS FREQUENTES");



    }
}
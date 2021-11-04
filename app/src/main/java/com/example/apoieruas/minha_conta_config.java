package com.example.apoieruas;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class minha_conta_config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minha_conta_config);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //Histórico Doações
        RelativeLayout histdoa = (RelativeLayout) findViewById(R.id.histdoa);
        histdoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(minha_conta_config.this,histdoa.class);
                startActivity(intent);
            }
        });

        TextView textohist = (TextView) findViewById(R.id.textohist);
        textohist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent texto_minha_conta = new Intent(minha_conta_config.this,histdoa.class);
                startActivity(texto_minha_conta);
            }
        });

        androidx.appcompat.widget.AppCompatButton btn_hist = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btn_hist);
        btn_hist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_minha_conta = new Intent(minha_conta_config.this,histdoa.class);
                startActivity(btn_minha_conta);
            }
        });

        //Sair
        RelativeLayout sair = (RelativeLayout) findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(minha_conta_config.this,tela_entrar.class);
                startActivity(intent);
                finish();
            }
        });

        TextView texto_sair = (TextView) findViewById(R.id.texto_sair);
        texto_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent texto_minha_conta = new Intent(minha_conta_config.this,tela_entrar.class);
                startActivity(texto_minha_conta);
                finish();
            }
        });


//        ImageView morador = (ImageView) findViewById(R.id.morador);
//        morador.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction()
//                        .add(R.id.container, new NotificationsFragment())
//                        .commit();
//                }
//
//        });

        TextView title = findViewById(R.id.configs);
        title.setText("MINHA CONTA");





    }


}


package com.example.apoieruas;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class configs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_configs);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());

        //Minha conta - Começo
        RelativeLayout minha_conta = (RelativeLayout) findViewById(R.id.minha_conta1);
        minha_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,minha_conta_config.class);
                startActivity(intent);
            }
        });

        TextView texto_minha_conta = (TextView) findViewById(R.id.texto_minha_conta);
        texto_minha_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent texto_minha_conta = new Intent(configs.this,minha_conta_config.class);
                startActivity(texto_minha_conta);
            }
        });

        androidx.appcompat.widget.AppCompatButton btn_minha_conta = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btn_minha_conta);
        btn_minha_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_minha_conta = new Intent(configs.this,minha_conta_config.class);
                startActivity(btn_minha_conta);
            }
        });
        //Minha conta - Fim

        //Informações Legais - Começo
        RelativeLayout infolegal = (RelativeLayout) findViewById(R.id.infolegal);
        infolegal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,info_legais.class);
                startActivity(intent);
            }
        });

        TextView texto_info = (TextView) findViewById(R.id.texto_info);
        texto_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent texto_minha_conta = new Intent(configs.this,info_legais.class);
                startActivity(texto_minha_conta);
            }
        });

        androidx.appcompat.widget.AppCompatButton btninfo = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btninfo);
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_minha_conta = new Intent(configs.this,info_legais.class);
                startActivity(btn_minha_conta);
            }
        });
        //Informações Legais - Fim

        //Site - Começo
        RelativeLayout site = (RelativeLayout) findViewById(R.id.site);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/")));
            }
        });

        TextView texto_site = (TextView) findViewById(R.id.texto_site);
        texto_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/")));
            }
        });

        androidx.appcompat.widget.AppCompatButton btnsite = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btnsite);
        btnsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.br/")));
            }
        });
        //Site - Fim

        //Fale Conosco - Começo
        RelativeLayout faleconosco = (RelativeLayout) findViewById(R.id.faleconosco);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,fale_conosco.class);
                startActivity(intent);
            }
        });

        TextView texto_faleconosco = (TextView) findViewById(R.id.texto_faleconosco);
        texto_faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,fale_conosco.class);
                startActivity(intent);
            }
        });

        androidx.appcompat.widget.AppCompatButton btnfaleconosco = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btnfaleconosco);
        btnfaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,fale_conosco.class);
                startActivity(intent);
            }
        });
        //Fale Conosco - Fim

        //FAQ - Começo
        RelativeLayout faq = (RelativeLayout) findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,faq.class);
                startActivity(intent);
            }
        });

        TextView texto_faq = (TextView) findViewById(R.id.texto_faq);
        texto_faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,faq.class);
                startActivity(intent);
            }
        });

        androidx.appcompat.widget.AppCompatButton btnfaq = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btnfaq);
        btnfaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(configs.this,faq.class);
                startActivity(intent);
            }
        });
        //FAQ - Fim

        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("CONFIGURAÇÕES");
        //Texto Toolbar

    }
}


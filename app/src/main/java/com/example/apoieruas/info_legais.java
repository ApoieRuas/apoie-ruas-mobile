package com.example.apoieruas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class info_legais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_legais);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
//
//        //Minha conta - Começo
//        RelativeLayout minha_conta = (RelativeLayout) findViewById(R.id.minha_conta1);
//        minha_conta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(configs.this,minha_conta_config.class);
//                startActivity(intent);
//            }
//        });
//
//
//        TextView texto_minha_conta = (TextView) findViewById(R.id.texto_minha_conta);
//        texto_minha_conta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent texto_minha_conta = new Intent(configs.this,minha_conta_config.class);
//                startActivity(texto_minha_conta);
//            }
//        });
//
//        androidx.appcompat.widget.AppCompatButton btn_minha_conta = (androidx.appcompat.widget.AppCompatButton) findViewById(R.id.btn_minha_conta);
//        btn_minha_conta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent btn_minha_conta = new Intent(configs.this,minha_conta_config.class);
//                startActivity(btn_minha_conta);
//            }
//        });
//        //Minha conta - Fim

        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("INFORMAÇÕES LEGAIS");

    }
}


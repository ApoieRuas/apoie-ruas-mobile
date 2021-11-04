package com.example.apoieruas;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class item_screen extends AppCompatActivity {

    ImageView absorvente;
    RelativeLayout layout;

    ImageView aparelho;
    RelativeLayout layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_screen);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("PRODUTOS");

        absorvente = findViewById(R.id.absorvente);
        layout = findViewById(R.id.produto1);

        aparelho = findViewById(R.id.aparelho);
        layout2 = findViewById(R.id.produto2);


    }

    public void expandimg(View view) {
        int v = (absorvente.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        absorvente.setVisibility(v);
    }

    public void expandimg2(View view) {
        int v = (aparelho.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        aparelho.setVisibility(v);
    }
}
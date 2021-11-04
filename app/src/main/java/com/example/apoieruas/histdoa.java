package com.example.apoieruas;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class histdoa extends AppCompatActivity {

    androidx.cardview.widget.CardView layout;
    androidx.cardview.widget.CardView layout2;
    androidx.cardview.widget.CardView layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.histdoa);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("HISTÓRICO DE DOAÇÕES");

        layout = findViewById(R.id.card1);

        layout2 = findViewById(R.id.card2);

        layout3 = findViewById(R.id.card3);

    }

    public void delete(View view) {
        int v = (layout.getVisibility() == View.VISIBLE)? View.GONE: View.VISIBLE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        layout.setVisibility(v);
    }

    public void delete2(View view) {
        int v = (layout2.getVisibility() == View.VISIBLE)? View.GONE: View.VISIBLE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        layout2.setVisibility(v);
    }

    public void delete3(View view) {
        int v = (layout3.getVisibility() == View.VISIBLE)? View.GONE: View.VISIBLE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        layout3.setVisibility(v);
    }
}
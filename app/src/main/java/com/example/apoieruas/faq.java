package com.example.apoieruas;

import android.animation.LayoutTransition;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class faq extends AppCompatActivity {

    TextView card1faq;
    RelativeLayout layoutfaq1;

    TextView card2faq;
    RelativeLayout layoutfaq2;

    TextView card3faq;
    RelativeLayout layoutfaq3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);
        getWindow().setStatusBarColor(Color.RED);
        getWindow().setNavigationBarColor(Color.RED);
        getSupportActionBar().hide();

        //Botão Voltar da Toolbar
        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(v -> finish());
        //Texto Toolbar
        TextView title = findViewById(R.id.configs);
        title.setText("PERGUNTAS FREQUENTES");

        layoutfaq1 = findViewById(R.id.pergunta1);
        layoutfaq1.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        card1faq = findViewById(R.id.card1faq);

        layoutfaq2 = findViewById(R.id.pergunta2);
        layoutfaq2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        card2faq = findViewById(R.id.card2faq);

        layoutfaq3 = findViewById(R.id.pergunta3);
        layoutfaq3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        card3faq = findViewById(R.id.card3faq);



    }

    public void faq1(View view) {
        int v = (card1faq.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layoutfaq1, new AutoTransition());
        card1faq.setVisibility(v);
    }

    public void faq2(View view) {
        int v = (card2faq.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layoutfaq2, new AutoTransition());
        card2faq.setVisibility(v);
    }

    public void faq3(View view) {
        int v = (card3faq.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layoutfaq3, new AutoTransition());
        card3faq.setVisibility(v);
    }
}
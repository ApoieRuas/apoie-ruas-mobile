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

    ImageView barraca;
    RelativeLayout layout3;

    ImageView camisa;
    RelativeLayout layout4;

    ImageView chinelo;
    RelativeLayout layout5;

    ImageView cobertor;
    RelativeLayout layout6;

    ImageView cotonetes;
    RelativeLayout layout7;

    ImageView desodorante;
    RelativeLayout layout8;

    ImageView fiodental;
    RelativeLayout layout9;

    ImageView fraldageriatrica;
    RelativeLayout layout10;

    ImageView fraldainfantil;
    RelativeLayout layout11;

    ImageView garrafa;
    RelativeLayout layout12;

    ImageView kit;
    RelativeLayout layout13;

    ImageView lenco;
    RelativeLayout layout14;

    ImageView papel;
    RelativeLayout layout15;

    ImageView protetor;
    RelativeLayout layout16;

    ImageView racao;
    RelativeLayout layout17;

    ImageView sabonete;
    RelativeLayout layout18;

    ImageView shampoo;
    RelativeLayout layout19;

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

        barraca = findViewById(R.id.barraca);
        layout3 = findViewById(R.id.produto3);

        camisa = findViewById(R.id.camisa);
        layout4 = findViewById(R.id.produto4);

        chinelo = findViewById(R.id.chinelo);
        layout5 = findViewById(R.id.produto5);

        cobertor = findViewById(R.id.cobertor);
        layout6 = findViewById(R.id.produto6);

        cotonetes = findViewById(R.id.cotonetes);
        layout7 = findViewById(R.id.produto7);

        desodorante = findViewById(R.id.desodorante);
        layout8 = findViewById(R.id.produto8);

        fiodental = findViewById(R.id.fiodental);
        layout9 = findViewById(R.id.produto9);

        fraldageriatrica = findViewById(R.id.fraldageriatrica);
        layout10 = findViewById(R.id.produto10);

        fraldainfantil = findViewById(R.id.fraldainfantil);
        layout11 = findViewById(R.id.produto11);

        garrafa = findViewById(R.id.garrafa);
        layout12 = findViewById(R.id.produto12);

        kit = findViewById(R.id.kit);
        layout13 = findViewById(R.id.produto13);

        lenco = findViewById(R.id.lenco);
        layout14 = findViewById(R.id.produto14);

        papel = findViewById(R.id.papel);
        layout15 = findViewById(R.id.produto15);

        protetor = findViewById(R.id.protetor);
        layout16 = findViewById(R.id.produto16);

        racao = findViewById(R.id.racao);
        layout17 = findViewById(R.id.produto17);

        sabonete = findViewById(R.id.sabonete);
        layout18 = findViewById(R.id.produto18);

        layout19 = findViewById(R.id.produto19);
        shampoo = findViewById(R.id.shampoo);

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

    public void expandimg3(View view) {
        int v = (barraca.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        barraca.setVisibility(v);
    }

    public void expandimg4(View view) {
        int v = (camisa.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout4, new AutoTransition());
        camisa.setVisibility(v);
    }

    public void expandimgchinelo(View view) {
        int v = (chinelo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout5, new AutoTransition());
        chinelo.setVisibility(v);
    }

    public void expandimg5(View view) {
        int v = (cobertor.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout6, new AutoTransition());
        cobertor.setVisibility(v);
    }

    public void expandimg6(View view) {
        int v = (cotonetes.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout7, new AutoTransition());
        cotonetes.setVisibility(v);
    }

    public void expandimg7(View view) {
        int v = (desodorante.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout8, new AutoTransition());
        desodorante.setVisibility(v);
    }

    public void expandimg8(View view) {
        int v = (fiodental.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout9, new AutoTransition());
        fiodental.setVisibility(v);
    }

    public void expandimg9(View view) {
        int v = (fraldageriatrica.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout10, new AutoTransition());
        fraldageriatrica.setVisibility(v);
    }

    public void expandimg10(View view) {
        int v = (fraldainfantil.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout11, new AutoTransition());
        fraldainfantil.setVisibility(v);
    }

    public void expandimg12(View view) {
        int v = (garrafa.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout12, new AutoTransition());
        garrafa.setVisibility(v);
    }

    public void expandimg13(View view) {
        int v = (kit.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout13, new AutoTransition());
        kit.setVisibility(v);
    }

    public void expandimg14(View view) {
        int v = (lenco.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout14, new AutoTransition());
        lenco.setVisibility(v);
    }

    public void expandimg15(View view) {
        int v = (papel.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout15, new AutoTransition());
        papel.setVisibility(v);
    }

    public void expandimg16(View view) {
        int v = (protetor.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout16, new AutoTransition());
        protetor.setVisibility(v);
    }

    public void expandimg17(View view) {
        int v = (racao.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout17, new AutoTransition());
        racao.setVisibility(v);
    }

    public void expandimg18(View view) {
        int v = (sabonete.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout18, new AutoTransition());
        sabonete.setVisibility(v);
    }

    public void expandimg19(View view) {
        int v = (shampoo.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout19, new AutoTransition());
        shampoo.setVisibility(v);
    }
}
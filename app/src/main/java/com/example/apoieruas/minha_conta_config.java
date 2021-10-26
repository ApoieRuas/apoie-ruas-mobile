package com.example.apoieruas;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class minha_conta_config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minha_conta_config);
        getSupportActionBar().hide();

        ImageView back = (ImageView) findViewById(R.id.arrow_back_config);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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


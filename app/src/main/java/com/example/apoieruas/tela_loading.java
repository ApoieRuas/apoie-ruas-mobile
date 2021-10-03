package com.example.apoieruas;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class tela_loading extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

        getSupportActionBar().hide();

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(tela_loading.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tempo = new Timer();
        tempo.schedule(tarea, 5000);
    }
}
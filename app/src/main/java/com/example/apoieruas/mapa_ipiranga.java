package com.example.apoieruas;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class mapa_ipiranga extends AppCompatActivity {



    SliderView sliderView;
    int[] images = {R.drawable.ipiranga,
            R.drawable.ipiranga_mapa,
            R.drawable.morador2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapa_ipiranga);
        getSupportActionBar().hide();
        sliderView = findViewById(R.id.image_slider_ipiranga);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.startAutoCycle();


        ImageView back = (ImageView) findViewById(R.id.arrow_back);
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

        TextView title = findViewById(R.id.toolbar_title);

        title.setText("Ipiranga");





    }


}

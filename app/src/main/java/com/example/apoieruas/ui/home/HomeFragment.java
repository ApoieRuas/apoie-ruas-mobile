package com.example.apoieruas.ui.home;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.apoieruas.R;
import com.example.apoieruas.SliderAdapterHome;
import com.example.apoieruas.configs;
import com.example.apoieruas.databinding.FragmentHomeBinding;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    SliderView sliderView;
    int[] images = {R.drawable.mo1,
                    R.drawable.mo2,
                    R.drawable.mo3,
                    R.drawable.mo4,
                    R.drawable.mo5};

    Dialog mDialog;



    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

    binding = FragmentHomeBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        sliderView = view.findViewById(R.id.image_slider_home);

        SliderAdapterHome sliderAdapterHome = new SliderAdapterHome(images);

        sliderView.setSliderAdapter(sliderAdapterHome);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.startAutoCycle();

        ImageView settings = view.findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, configs.class));
                }
            }
        });



        return view;

    }


@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
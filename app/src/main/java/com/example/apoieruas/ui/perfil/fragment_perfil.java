package com.example.apoieruas.ui.perfil;

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
import com.example.apoieruas.configs;
import com.example.apoieruas.databinding.FragmentPerfilBinding;
import com.example.apoieruas.minha_conta_config;


public class fragment_perfil extends Fragment {

    private PerfilViewModel perfilViewModel;
    private FragmentPerfilBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_perfil, container, false);

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

        ImageView account = view.findViewById(R.id.exit);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, minha_conta_config.class));
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
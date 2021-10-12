package com.example.apoieruas.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.apoieruas.R;
import com.example.apoieruas.databinding.FragmentDashboardBinding;
import com.example.apoieruas.mapa_freguesia;
import com.example.apoieruas.mapa_ipiranga;
import com.example.apoieruas.mapa_itaquera;
import com.example.apoieruas.mapa_jacana;
import com.example.apoieruas.mapa_penha;
import com.example.apoieruas.mapa_pinheiros;
import com.example.apoieruas.mapa_santoamaro;
import com.example.apoieruas.mapa_saomatheus;
import com.example.apoieruas.mapa_tiradentes;
import com.example.apoieruas.mapa_vilamaria;
import com.example.apoieruas.mapa_vilamariana;

public class DashboardFragment extends Fragment   {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        androidx.appcompat.widget.AppCompatButton btnfreguesia = view.findViewById(R.id.btnfreguesia);
        btnfreguesia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_freguesia.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnipiranga = view.findViewById(R.id.btnipiranga);
        btnipiranga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_ipiranga.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnitaquera = view.findViewById(R.id.btnitaquera);
        btnitaquera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_itaquera.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnjacana = view.findViewById(R.id.btnjacana);
        btnjacana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_jacana.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnvilamariana = view.findViewById(R.id.btnvilamariana);
        btnvilamariana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_vilamariana.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnsaomatheus = view.findViewById(R.id.btnsaomatheus);
        btnsaomatheus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_saomatheus.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnpenha = view.findViewById(R.id.btnpenha);
        btnpenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_penha.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnpinheiros = view.findViewById(R.id.btnpinheiros);
        btnpinheiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_pinheiros.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnsantoamaro = view.findViewById(R.id.btnsantoamaro);
        btnsantoamaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_santoamaro.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btntiradentes = view.findViewById(R.id.btntiradentes);
        btntiradentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_tiradentes.class));
                }
            }
        });

        androidx.appcompat.widget.AppCompatButton btnvilamaria = view.findViewById(R.id.btnvilamaria);
        btnvilamaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_vilamaria.class));
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
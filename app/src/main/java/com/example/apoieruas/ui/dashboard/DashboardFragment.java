package com.example.apoieruas.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.apoieruas.R;
import com.example.apoieruas.databinding.FragmentDashboardBinding;
import com.example.apoieruas.mapa_freguesia;

public class DashboardFragment extends Fragment   {

    private DashboardViewModel dashboardViewModel;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        RelativeLayout btn = view.findViewById(R.id.primeiro);

        /*
         * Define a ação do Botão, é o mesmo que você está fazendo através do
         * onClick no XML.
         */
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, mapa_freguesia.class));
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
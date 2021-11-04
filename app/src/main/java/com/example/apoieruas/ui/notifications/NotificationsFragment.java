package com.example.apoieruas.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.apoieruas.Mask;
import com.example.apoieruas.R;
import com.example.apoieruas.agradecimento_apoio;
import com.example.apoieruas.configs;
import com.example.apoieruas.databinding.FragmentNotificationsBinding;
import com.example.apoieruas.item_screen;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private FragmentNotificationsBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_notifications, container, false);

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

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        EditText datanascmorador = (EditText) getView().findViewById(R.id.datanascmorador);
        datanascmorador.addTextChangedListener(Mask.insert("##/##/####", datanascmorador));

        Spinner spinner = (Spinner) view.findViewById(R.id.sexomorador);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.sexo, R.layout.style_spiner);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(R.layout.style_drop_spiner);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) view.findViewById(R.id.cormorador);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.cores, R.layout.style_spiner);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(R.layout.style_drop_spiner);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) view.findViewById(R.id.regiaomorador);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.regioes, R.layout.style_spiner);
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(R.layout.style_drop_spiner);
        // Apply the adapter to the spinner
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) view.findViewById(R.id.qntitem);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this.getActivity(),
                R.array.produtos, R.layout.style_spiner);
        // Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(R.layout.style_drop_spiner);
        // Apply the adapter to the spinner
        spinner4.setAdapter(adapter4);




        androidx.appcompat.widget.AppCompatButton btnitem = view.findViewById(R.id.btnitem);
        btnitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, item_screen.class));
                }
            }
        });

        Button btnfinish = view.findViewById(R.id.btnfinish);
        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, agradecimento_apoio.class));
                }
            }
        });


    }


@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
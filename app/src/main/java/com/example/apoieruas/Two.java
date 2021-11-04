package com.example.apoieruas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Two#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Two extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Two() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Two.
     */
    // TODO: Rename and change types and number of parameters
    public static Two newInstance(String param1, String param2) {
        Two fragment = new Two();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two1, container, false);

    }


    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        EditText phone = (EditText) getView().findViewById(R.id.phone);
        phone.addTextChangedListener(Mask.insert("(##) #####-####", phone));

        EditText cpf = (EditText) getView().findViewById(R.id.cpf);
        cpf.addTextChangedListener(Mask.insert("###.###.###/##", cpf));

        androidx.appcompat.widget.AppCompatButton Botão_cadastrar = view.findViewById(R.id.Botão_cadastrar);
        Botão_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentActivity act = getActivity();

                if (act != null) {
                    startActivity(new Intent(act, intro_screen.class));
                    getActivity().finish();
                }
            }
        });
    }
    }
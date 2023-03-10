package com.example.stock;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EntradaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EntradaFragment extends Fragment {


    private ListView listView;
    private ArrayAdapter adapter;
    private ArrayList<String> entrada;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EntradaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EntradaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EntradaFragment newInstance(String param1, String param2) {
        EntradaFragment fragment = new EntradaFragment();
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
                             Bundle savedInstanceState){
        //Instanciar objetos
        entrada = new ArrayList<>();
        entrada.add("Produto-13");
        entrada.add("Produto-14");
        entrada.add("Produto-15");
        entrada.add("Produto-16");
        entrada.add("Produto-17");
        entrada.add("Produto-18");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_entrada, container, false);

        listView = (ListView) view.findViewById(R.id.listView_Entrada);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, entrada);
        listView.setAdapter(adapter);

        return view;
    }
}

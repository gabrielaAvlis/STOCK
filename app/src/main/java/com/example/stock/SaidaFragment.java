package com.example.stock;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SaidaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SaidaFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter adapter;
    private ArrayList<String> saida;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SaidaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SaidaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SaidaFragment newInstance(String param1, String param2) {
        SaidaFragment fragment = new SaidaFragment();
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
        saida = new ArrayList<>();
        saida.add("produto-19");
        saida.add("produto-20");
        saida.add("produto-21");
        saida.add("produto-22");
        saida.add("produto-23");
        saida.add("produto-24");
        saida.add("produto-25");

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saida, container, false);

        listView = (ListView) view.findViewById(R.id.listView_Saida);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, saida);
        listView.setAdapter(adapter);

        return view;
    }
}

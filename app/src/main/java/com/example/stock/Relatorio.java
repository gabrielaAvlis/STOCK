package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.FragmentTransitionSupport;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Relatorio extends AppCompatActivity {


    private Button btnEmEstoque, btnEntradas, btnSaidas;

    private EstoqueFragment estoqueFragment;
    private EntradaFragment entradaFragment;
    private SaidaFragment saidaFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);

        btnEmEstoque = findViewById(R.id.btnEmEstoque);
        btnEntradas = findViewById(R.id.btnEntradas);
        btnSaidas = findViewById(R.id.btnSaidas);


        //Remover sombra da ActinBar
        //getSupportActionBar().setElevation(0);


        estoqueFragment = new EstoqueFragment();

        //Configurar objeto para o Fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, estoqueFragment);
        transaction.commit();

        btnEmEstoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                estoqueFragment = new EstoqueFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, estoqueFragment);
                transaction.commit();
            }
        });

        btnEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                entradaFragment = new EntradaFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, entradaFragment);
                transaction.commit();
            }
        });

        btnSaidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                saidaFragment = new SaidaFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, saidaFragment);
                transaction.commit();
            }
        });

    }
}
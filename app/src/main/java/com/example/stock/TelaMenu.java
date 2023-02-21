package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
    }

    public void acessar(View v){
        Intent i =new Intent(this, TelaMenu.class);
        startActivity(i);
    }

    public void cadastrarProduto(View v){
        Intent i =new Intent(this, CadastroProduto.class);
        startActivity(i);
    }

    public void consultarProduto(View v){
        Intent i =new Intent(this, ConsultarProduto.class);
        startActivity(i);
    }

    public void relatorio(View v){
        Intent i =new Intent(this, Relatorio.class);
        startActivity(i);
    }

    public void movimentacao(View v){
        Intent i =new Intent(this, movimentacao.class);
        startActivity(i);
    }
}
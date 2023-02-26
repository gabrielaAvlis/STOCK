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

    public void onClickCadastrarProduto(View view) {
        Intent intent = new Intent(this, CadastroProduto.class);
        startActivity(intent);
    }


    public void onClickRelatorio(View view) {
        Intent intent = new Intent(this, Relatorio.class);
        startActivity(intent);
    }
}
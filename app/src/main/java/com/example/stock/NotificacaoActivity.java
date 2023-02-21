package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NotificacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacao);

        TextView texto = (TextView) findViewById(R.id.txtMsg);

        String mensagem = getIntent().getStringExtra("mensagem");
        texto.setText(mensagem);
    }

    //Márcio: Ação do botão "Ir para Stock"
    public void onclickirparastock(View view) {
        Intent in = new Intent(NotificacaoActivity.this, loginActivity.class);
        startActivity(in);
    }
}
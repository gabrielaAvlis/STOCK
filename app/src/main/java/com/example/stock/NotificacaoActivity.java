package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
}
package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void cadastrar(View v){
        Intent i =new Intent(this, CadastroActivity.class);
        startActivity(i);
    }

    public void acessar(View v){
        Intent i =new Intent(this, TelaMenu.class);
        startActivity(i);
    }
}
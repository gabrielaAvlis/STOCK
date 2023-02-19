package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText msg = (EditText) findViewById(R.id.edtTexto);
        Button enviar = (Button) findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotificacaoActivity.class);
                intent.putExtra("mensagem", msg.getText().toString());
                int id = (int) (Math.random()*1000);
                PendingIntent pi = PendingIntent.getActivity(getBaseContext(), id,
                        intent, PendingIntent.FLAG_UPDATE_CURRENT);

                Notification notification = new Notification.Builder(getBaseContext())
                        .setContentTitle("De: STOCK" )
                        .setContentText(msg.getText()).setSmallIcon(R.mipmap.ic_launcher)
                        .setContentIntent(pi).build();
                NotificationManager notificationManager =
                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notification.flags |= Notification.FLAG_AUTO_CANCEL;

                notificationManager.notify(id, notification);

            }
        });
    }
}
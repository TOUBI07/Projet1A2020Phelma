package com.example.projet1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView message = (TextView) findViewById(R.id.message);
        TextView message1 = (TextView) findViewById(R.id.message1);
        TextView message2 = (TextView) findViewById(R.id.message2);
        TextView title = (TextView) findViewById(R.id.title);


        title.setText("Title");
        message.setText("Projet 1A Phelma");
        message1.setText("SYSTÈME D'ALARME PORTATIF EN CAS DE CHUTE D’UNE PERSONNE  ÂGÉE");
        message2.setText("Further .... ");

    }
}

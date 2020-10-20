package com.dsi31.bonjournom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String nom;
    EditText inputNom;
    TextView display;
    Button envoyer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //liaison par id
        inputNom = (EditText) findViewById(R.id.inputNom);
        display = (TextView) findViewById(R.id.afficherNom);
        envoyer = (Button) findViewById(R.id.envoyer);

        //on click
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = inputNom.getText().toString();
                display.setText("Bonjour "+nom+" !");
            }
        });
    }
}
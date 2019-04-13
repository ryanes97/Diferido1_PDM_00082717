package com.example.evaluacion_labo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt1,txt2,txt3,txt4;
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                mIntent.putExtra("title", "Usuario:");
                mIntent.putExtra("data", txt1.getText().toString());
                startActivity(mIntent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this,SecondActivity.class);
                mIntent.putExtra("title", "Correo:");
                mIntent.putExtra("data", txt2.getText().toString());
                startActivity(mIntent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                mIntent.putExtra("title", "Edad:");
                mIntent.putExtra("data", txt3.getText().toString());
                startActivity(mIntent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
                mIntent.putExtra("title", "Contraseña:");
                mIntent.putExtra("data", txt4.getText().toString());
                startActivity(mIntent);
            }
        });


    }
}

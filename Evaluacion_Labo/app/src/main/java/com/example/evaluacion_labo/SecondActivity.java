package com.example.evaluacion_labo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView view1, view2;
    Button btn_share;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent mIntent = getIntent();

        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);

        btn_share = findViewById(R.id.btn_share);

        if(mIntent != null){

            String title = mIntent.getStringExtra("title");
            String data = mIntent.getStringExtra("data");

            view1.setText(title);
            view2.setText(data);

        }

        btn_share.setOnClickListener(v->{
            Intent mIntentShare = new Intent();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");
            mIntentShare.putExtra(Intent.EXTRA_TEXT, "Dato: " + view2.getText().toString());
            startActivity(mIntentShare);
        });



    }
}

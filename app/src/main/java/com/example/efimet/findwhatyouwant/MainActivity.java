package com.example.efimet.findwhatyouwant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emergency = findViewById(R.id.b_emergency);
        emergency.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openEmergency();
            }
        });


        Button transportation = findViewById(R.id.b_transportation);
        transportation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openTransportation();
            }
        });

        Button entertainment = findViewById(R.id.b_entertainment );
        entertainment.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openEntertainment();
            }
        });

    }

    public void openEmergency(){
        Intent intent1 = new Intent(this,Emergency.class);
        startActivity(intent1);
    }

    public void openTransportation(){
        Intent intent3 = new Intent(this,Transportation.class);
        startActivity(intent3);
    }

    public void openEntertainment(){
        Intent intent4 = new Intent(this,Entertainment.class);
        startActivity(intent4);
    }
}
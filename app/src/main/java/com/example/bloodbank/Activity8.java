package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity8 extends AppCompatActivity {
    private Button button12;
    private Button button13;
    private Button button7;
    private Button button8;
    private Button button10;
    private Button button11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openM_account();
            }
        });

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openM_stock();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openM_donor();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openM_requister();
            }
        });

        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openO_donation();
            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openR_View();
            }
        });

    }
    public void openM_account(){
        Intent intent = new Intent(this, M_account.class);
        startActivity(intent);
    }
    public void openM_stock(){
        Intent intent = new Intent(this, M_stock.class);
        startActivity(intent);
    }
    public void openM_donor(){
        Intent intent = new Intent(this, M_donor.class);
        startActivity(intent);
    }
    public void openM_requister(){
        Intent intent = new Intent(this, M_requister.class);
        startActivity(intent);
    }
    public void openO_donation(){
        Intent intent = new Intent(this, O_donation.class);
        startActivity(intent);
    }
    public void openR_View(){
        Intent intent = new Intent(this, R_View.class);
        startActivity(intent);
    }
}

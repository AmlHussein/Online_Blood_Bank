package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
                displayToast();
            }
        });
    }

    public void openActivity2(){
        Intent intent2 = new Intent(this, Activity2.class);
        startActivity(intent2);
    }

    public void displayToast(){
        Toast.makeText(MainActivity.this,"Welcome to Blood bank",Toast.LENGTH_SHORT).show();
    }
}

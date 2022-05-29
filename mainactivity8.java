package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        button15 = findViewById(R.id.Itenary8);
        button16 = findViewById(R.id.LS8);
        button17 = findViewById(R.id.info8);
        button18 = findViewById(R.id.ads8);
        Intent intent15 = new Intent(this, MainActivity14.class);
        Intent intent16 = new Intent(this,MainActivity15.class);
        Intent intent17 = new Intent (this, MainActivity16.class);
        Intent intent18 = new Intent(this, MainActivity17.class);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent15);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent16);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent17);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent18);
            }
        });


    }
}

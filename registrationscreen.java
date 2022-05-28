package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
    button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this, "Verification link sent to your EmailId", Toast.LENGTH_SHORT).show();
        }
    });
    }

package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
   private Button button69, button70, button71, button72;
   private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button69 = findViewById(R.id.mumbai);
        button70 = findViewById(R.id.Pune);
        button71 = findViewById(R.id.Aurangabad);
        button72 = findViewById(R.id.Shirdi);
        Intent intent69 = new Intent(this, MainActivity8.class);
        Intent intent70 = new Intent(this, MainActivity9.class);
        Intent intent71 = new Intent(this, MainActivity10.class);
        Intent intent72 = new Intent(this, MainActivity11.class);
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Welcome to Mumbai", Toast.LENGTH_SHORT).show();
                startActivity(intent69);
            }
        });
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Welcome to Pune", Toast.LENGTH_SHORT).show();
                startActivity(intent70);
            }
        });
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Welcome to Aurangabad", Toast.LENGTH_SHORT).show();
                startActivity(intent71);
            }
        });
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Welcome to the city of Shirdi", Toast.LENGTH_SHORT).show();
                startActivity(intent72);
            }
        });


    }
}

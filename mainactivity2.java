package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button1;
    private Button button3;
    private Button button4;
    private Button button5;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = findViewById(R.id.maharashtra);
        button3 = findViewById(R.id.karnataka);
        button4 = findViewById(R.id.uttarakhand);
        button5 = findViewById(R.id.Westbengal);
        Intent intent1 = new Intent(this, MainActivity3.class);
        Intent intent2 = new Intent(this,MainActivity5.class);
        Intent intent3 = new Intent (this, MainActivity7.class);
        Intent intent4 = new Intent(this, MainActivity4.class);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Welcome to the Maharashtra", Toast.LENGTH_SHORT).show();
                startActivity(intent1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Welcome to Karnataka", Toast.LENGTH_SHORT).show();
                startActivity(intent2);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Welcome to Uttarakhand", Toast.LENGTH_SHORT).show();
                startActivity(intent3);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Welcome to West Bengal", Toast.LENGTH_SHORT).show();
                startActivity(intent4);
            }
        });


    }
}

package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button button79, button80, button81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button79 = findViewById(R.id.Kolkata);
        button80 = findViewById(R.id.Sundarban);
        button81 = findViewById(R.id.Darjeeling);
    }
}

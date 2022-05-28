package com.example.travelsphere;

import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextTextPersonName);
        editText = findViewById(R.id.editTextPhone4);
        editText = findViewById(R.id.editTextTextEmailAddress);
        aSwitch = findViewById(R.id.switch1);
        Intent intent = new Intent(this, MainActivity2.class);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                makeText(MainActivity.this, "Welcome to TravelSphere", LENGTH_SHORT).show();
                startActivity(intent);

            }
        });
    }
}

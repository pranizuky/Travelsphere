package com.example.travelsphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity15 extends AppCompatActivity {
    private ImageButton imageButton1,imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        imageButton1 = findViewById(R.id.vadapav);
        imageButton2 = findViewById(R.id.pavbhaji);
        Intent intent222 = new Intent(this, MainActivity18.class);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent222);

            }
        });
    }
}

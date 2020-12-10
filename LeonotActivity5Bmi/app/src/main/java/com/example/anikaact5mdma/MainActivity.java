package com.example.anikaact5mdma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText names;
    EditText weights;
    EditText heights;
    Button btnGo;
    TextView results;
    String name;
    Float num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names = findViewById(R.id.names);
        weights = findViewById(R.id.weights);
        heights = findViewById(R.id.heights);
        results = findViewById(R.id.results);
        btnGo = findViewById(R.id.equals);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = names.getText().toString().trim();
                num2 = Float.parseFloat(heights.getText().toString());
                int num1 = Integer.parseInt(weights.getText().toString());
                float total = num1 / (num2 * num2);
                weights.setText("");
                heights.setText("");

                results.setText("Name: " +names +"\nBody Mass Index: " +total);
            }
        });

    }



}
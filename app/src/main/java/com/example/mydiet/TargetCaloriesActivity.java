package com.example.mydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TargetCaloriesActivity extends AppCompatActivity {

    Button btnNotSure, btnKnown;
    EditText avgCalories;
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_calories);
        btnNotSure = (Button)findViewById(R.id.btnUnkown);
        btnKnown = (Button)findViewById(R.id.btnKnown);
        avgCalories = (EditText) findViewById(R.id.etxtCaloriesAvg);
        user = (User)getIntent().getSerializableExtra("User");

        btnNotSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setAvgCalories(0);
                Intent intent = new Intent(TargetCaloriesActivity.this,SignUpActivity.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });

        btnKnown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setAvgCalories(Double.parseDouble(avgCalories.getText().toString()));
                Intent intent = new Intent(TargetCaloriesActivity.this,SignUpActivity.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });

    }
}
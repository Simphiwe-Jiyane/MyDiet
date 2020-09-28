package com.example.mydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HeightWeightActivty extends AppCompatActivity {

    EditText height, weight;
    Button next;
    User user =  new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        height = findViewById(R.id.etxtHeight);
        weight = findViewById(R.id.etxtWeight);
        next = (Button)findViewById(R.id.btnGoNext);
        setContentView(R.layout.activity_height_weight_activty);
        user = (User) getIntent().getSerializableExtra("User");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setHeight(Double.parseDouble(height.getText().toString()));
                user.setWeight(Double.parseDouble(weight.getText().toString()));
                Intent intent = new Intent(HeightWeightActivty.this,TargetWeightCaptureActivity.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
                    });
                    }
                    }
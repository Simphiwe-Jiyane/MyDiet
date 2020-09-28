package com.example.mydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TargetWeightCaptureActivity extends AppCompatActivity {

    EditText targetWeight, targetReason;
    Button next;
    User user = new User();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_weight_capture);
        user = (User) getIntent().getSerializableExtra("User");
        targetWeight = (EditText)findViewById(R.id.etxtTargetWeight);
        targetReason = (EditText)findViewById(R.id.etxtTargetReason);
        next = findViewById(R.id.btnGoNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double target = Double.parseDouble(targetWeight.getText().toString());
                String reason = targetReason.getText().toString();
                user.setTargetWeight(target);
                user.setTargetReason(reason);

            }
        });
    }
}
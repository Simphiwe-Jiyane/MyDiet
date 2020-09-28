package com.example.mydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button imperial, metric;
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imperial = (Button)findViewById(R.id.btnImperial);
        metric = (Button) findViewById(R.id.btnMetric);
        imperial.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view){
                user.setImeperial(true);
                Intent intent = new Intent(MainActivity.this,HeightWeightActivty.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });

        metric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setImeperial(false);
                Intent intent = new Intent(MainActivity.this,HeightWeightActivty.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });

    }
}
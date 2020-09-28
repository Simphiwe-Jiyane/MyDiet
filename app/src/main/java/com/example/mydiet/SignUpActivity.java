package com.example.mydiet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    EditText firstname,lastname, email, password, conPassword;
    Button signup;
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstname = (EditText)findViewById(R.id.txtFirstName);
        lastname  = (EditText)findViewById((R.id.txtLastName));
        email = (EditText)findViewById(R.id.txtEmail);
        password = (EditText)findViewById(R.id.txtPassword);
        conPassword = (EditText)findViewById(R.id.txtConfirmPassword);
        signup = (Button)findViewById(R.id.btnSignUp);
        user = (User)getIntent().getSerializableExtra("User");

        //TODO: Error checking here
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setFirstName(firstname.getText().toString());
                user.setSurname(lastname.getText().toString());
                user.setEmail(email.getText().toString());
                user.setPassword(password.getText().toString());

                Intent intent = new Intent(SignUpActivity.this,Home.class);
                intent.putExtra("User",user);
                startActivity(intent);
            }
        });
    }
}
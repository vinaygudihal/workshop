package com.example.marketing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button SUBMIT;
    private EditText email;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        SUBMIT=findViewById(R.id.button);
        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitbtn(email.getText().toString(),password.getText().toString());
            }
        });
        public void submitbtn(String user, String userpassword) {
            if (usermail.equals("vinay@gmail.com") && userpassword.equals("7890")) {
                Intent i = new Intent(MainActivity.this,display.class);
                startActivity(i);
            } else {
                Toast.makeText(this, "wrong user name", Toast.LENGTH_SHORT).show();
            }
            }
        }
    }


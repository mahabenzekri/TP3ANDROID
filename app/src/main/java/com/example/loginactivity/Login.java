package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getLocalClassName());
        final Button login = (Button) findViewById(R.id.login);
        final EditText log=(EditText) findViewById(R.id.name);
        final EditText pass=(EditText) findViewById(R.id.pass)

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (log.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    Intent intent = new Intent(Login.this, NewsList.class);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Toast message=Toast.makeText(Login.this,"saisie incorrect",Toast.LENGTH_LONG);
                    message.show();
                }

            }
        });
    }
}
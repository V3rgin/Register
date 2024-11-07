package com.example.register;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private Button submit;
    private TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        confirmPassword = findViewById(R.id.editTextConfirmPassword);
        submit = findViewById(R.id.buttonSubmit);
        info = findViewById(R.id.info);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }
        });

    }
    public void validation(){
        if(!email.getText().toString().contains("@")){
            info.setText("Nieprawidłowy adres email");
        }
        else if(!(password.getText().toString().equals(confirmPassword.getText().toString()))){
            info.setText("Hasla sie roznia");
        } else {
            info.setText("Witaj " + email.getText().toString());
        }
    }
}
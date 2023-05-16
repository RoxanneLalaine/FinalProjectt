package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {

    EditText eUsername, eEmail, ePassword, eConfirm;
    Button btn;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        eUsername = findViewById(R.id.editTextRegisterUsername);
        ePassword = findViewById(R.id.editTextRegPassword);
        eEmail = findViewById(R.id.editTextRegEmail);
        eConfirm = findViewById(R.id.editTextRegConfirmPassword);
        btn = findViewById(R.id.buttonRegister);
        tView = findViewById(R.id.textViewExistUser);

        tView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegActivity.this,LoginActivity.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = eUsername.getText().toString();
                String email = eEmail.getText().toString();
                String password = ePassword.getText ().toString();
                String confirm = eConfirm.getText().toString();

                if (username.length() == 0 || password.length() == 0 || email.length() == 0 || confirm.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill the details", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.compareTo(confirm) == 0) {
                        if (isValid(password)) {
                            Toast.makeText(getApplicationContext(),"Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegActivity.this, LoginActivity.class));
                        }
                        else{
                        Toast.makeText(getApplicationContext(), "Password must contain at least 8 characters, having letter, digit, and symbol", Toast.LENGTH_SHORT).show();}
                    } else {
                        Toast.makeText(getApplicationContext(), "Inputted password didn't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
    public static boolean isValid(String passwordhere){
        int f1=0,f2=0,f3=0;
        if (passwordhere.length()<8){
            return false;
        } else {
            for (int p = 0; p < passwordhere.length(); p++){
                if (Character.isDigit(passwordhere.charAt(p))) {
                    f1=1;
                }
            }
            for (int r = 0; r < passwordhere.length(); r++) {
                if (Character.isDigit(passwordhere.charAt(r))) {
                    f2=1;
                }
            }
            for (int s=0; s < passwordhere.length(); s++) {
                char c = passwordhere.charAt(s);
                if (c>33&&c<=46 || c==64){
                    f3=1;
                }
            }
            if (f1==1 && f2==1 && f3==1)
                return true;
            return false;
        }
    }
}
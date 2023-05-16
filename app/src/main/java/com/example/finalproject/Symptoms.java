package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Symptoms extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.symptoms);
    }
    public void backbuttonClicked(View view) {
        startActivity(new Intent(Symptoms.this, HomeActivity.class));

    }
}

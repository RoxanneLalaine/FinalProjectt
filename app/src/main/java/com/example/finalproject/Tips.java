package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tips extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.tipstab);
    }
    public void backbuttonClicked(View view) {
        startActivity(new Intent(Tips.this, HomeActivity.class));

    }
}

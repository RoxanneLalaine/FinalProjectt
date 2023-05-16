package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Vetdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super .onCreate(savedInstanceState);
        setContentView(R.layout.vetdetails);
    }
    public void backbuttonClicked(View view) {
        startActivity(new Intent(Vetdetails.this, FindDoctorActivity.class));

    }
}

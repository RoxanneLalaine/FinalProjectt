package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dentistdetails extends AppCompatActivity {

    //Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dentistdetail);

    }
    public void backbuttonClicked(View view) {
        startActivity(new Intent(Dentistdetails.this, FindDoctorActivity.class));

    }
}

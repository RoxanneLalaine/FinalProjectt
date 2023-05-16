package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Physiciandetails extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physician_details);

        /*btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Physiciandetails.this, FindDoctorActivity.class));
            }
        });*/
    }
    public void backbuttonClicked(View view) {
        startActivity(new Intent(Physiciandetails.this, FindDoctorActivity.class));

    }
}


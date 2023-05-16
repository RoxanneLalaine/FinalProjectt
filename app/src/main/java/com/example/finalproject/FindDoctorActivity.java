package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindDoctorActivity extends AppCompatActivity {

    CardView physician;
    CardView veterinarian;
    CardView dentist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);

        physician = findViewById(R.id.cardFDFamilyPhysician);
        veterinarian = findViewById(R.id.cardFDVet);
        dentist = findViewById(R.id.cardFDDentist);

        CardView physician = findViewById(R.id.cardFDFamilyPhysician);
        physician.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent( FindDoctorActivity.this,Physiciandetails.class));
            }
        });

        CardView veterinarian = findViewById(R.id.cardFDVet);
        veterinarian.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity (new Intent( FindDoctorActivity.this,Vetdetails.class));
            }
        });
        CardView dentist = findViewById(R.id.cardFDDentist);
        dentist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity (new Intent( FindDoctorActivity.this,Dentistdetails.class));
            }
        });

        CardView exit = findViewById(R.id.FDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (FindDoctorActivity.this,HomeActivity.class));
            }
        });

    }
}
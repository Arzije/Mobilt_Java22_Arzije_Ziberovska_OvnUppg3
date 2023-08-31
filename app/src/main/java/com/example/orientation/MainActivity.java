package com.example.orientation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int currentOrientation = getResources().getConfiguration().orientation;

        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
            spinner = findViewById(R.id.spinner);
            setupSpinner(R.array.dropdownPort);
        } else {
            setContentView(R.layout.activity_main);
            spinner = findViewById(R.id.colorSpinner);
            setupSpinner(R.array.dropdownLand);
        }
    }

    private void setupSpinner(int dropdownArrayId) {
        String[] names = getResources().getStringArray(dropdownArrayId);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, names);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }
}
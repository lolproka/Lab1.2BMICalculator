package com.example.user.lab12bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextHeight, editTextWeight;
    private ImageView imageViewResult;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void calculateBMI(View view){
        double weight, height, bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        bmi = weight / (height * height);

        if (bmi <= 18.5){
            imageViewResult.setImageResource(R.drawable.under);
            textViewResult.setText("Your BMI is " + bmi);
        }
        else if (bmi >= 21){
            imageViewResult.setImageResource(R.drawable.over);
            textViewResult.setText("Your BMI is " + bmi);
        }
        else
        {
            imageViewResult.setImageResource(R.drawable.normal);
            textViewResult.setText("Your BMI is " + bmi);
        }

    }

    public void deleteInput(View view){
        textViewResult.setText("Hi");
        editTextHeight.setText("");
        editTextWeight.setText("");
        imageViewResult.setImageResource(R.drawable.empty);
    }
}

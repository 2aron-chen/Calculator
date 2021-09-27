package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickPlus(View view){
        EditText firstTextField = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText secondTextField = (EditText) findViewById(R.id.editTextSecondNumber);
        String str1 = firstTextField.getText().toString();
        int iOne=Integer.parseInt(str1);
        String str2 = secondTextField.getText().toString();
        int iTwo=Integer.parseInt(str2);
        goToActivity2(iOne + iTwo);
    }

    public void clickMinus(View view){
        EditText firstTextField = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText secondTextField = (EditText) findViewById(R.id.editTextSecondNumber);
        String str1 = firstTextField.getText().toString();
        int iOne=Integer.parseInt(str1);
        String str2 = secondTextField.getText().toString();
        int iTwo=Integer.parseInt(str2);
        goToActivity2(iOne - iTwo);
    }

    public void clickTime(View view){
        EditText firstTextField = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText secondTextField = (EditText) findViewById(R.id.editTextSecondNumber);
        String str1 = firstTextField.getText().toString();
        double dOne=Double.parseDouble(str1);
        String str2 = secondTextField.getText().toString();
        double dTwo=Double.parseDouble(str2);
        goToActivity2(dOne * dTwo);
    }

    public void clickDivide(View view){
        EditText firstTextField = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText secondTextField = (EditText) findViewById(R.id.editTextSecondNumber);
        String str1 = firstTextField.getText().toString();
        double dOne=Double.parseDouble(str1);
        String str2 = secondTextField.getText().toString();
        double dTwo=Double.parseDouble(str2);
        goToActivity2(dOne / dTwo);
    }

    public void goToActivity2(double d){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("next", d);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.sarthaksinghal.calculator_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    double a,b;
    TextView RESULT;

    public void DoAdd(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        if(TextUtils.isEmpty(num1) && TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");
            input2.setError("Enter a number here");

        }
        else if (TextUtils.isEmpty(num1)) {
            input1.setError("Enter a number here");

        }
        else if(TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");

        }
        else {
            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            RESULT = (TextView) findViewById(R.id.result);
            RESULT.setText(String.valueOf(a + b));
        }

    }

    public void DoSubtract(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        if(TextUtils.isEmpty(num1) && TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");
            input2.setError("Enter a number here");

        }
        else if (TextUtils.isEmpty(num1)) {
            input1.setError("Enter a number here");

        }
        else if(TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");

        }
        else {
            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            RESULT = (TextView) findViewById(R.id.result);
            RESULT.setText(String.valueOf(a - b));
        }
    }

    public void DoMultiply(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        if(TextUtils.isEmpty(num1) && TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");
            input2.setError("Enter a number here");

        }
        else if (TextUtils.isEmpty(num1)) {
            input1.setError("Enter a number here");

        }
        else if(TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");

        }
        else {
            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            RESULT = (TextView) findViewById(R.id.result);
            RESULT.setText(String.valueOf(a * b));
        }
    }

    public void DoDivide(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        if(TextUtils.isEmpty(num1) && TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");
            input2.setError("Enter a number here");

        }
        else if (TextUtils.isEmpty(num1)) {
            input1.setError("Enter a number here");

        }
        else if(TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");

        }
        /*
        if(input1.getText()=="" || input2.getText()==""){
            RESULT=(TextView)findViewById(R.id.result);
            RESULT.setText("One of the numbers is missing.Please enter proper input");

        }*/
        else {
            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            RESULT = (TextView) findViewById(R.id.result);
            RESULT.setText(String.valueOf(a / b));
        }
    }

    public void DoRand(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        String num1 = input1.getText().toString();
        String num2 = input2.getText().toString();

        if(TextUtils.isEmpty(num1) && TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");
            input2.setError("Enter a number here");

        }
        else if (TextUtils.isEmpty(num1)) {
            input1.setError("Enter a number here");

        }
        else if(TextUtils.isEmpty(num2)) {
            input1.setError("Enter a number here");

        }
        else {
            a = Integer.parseInt(input1.getText().toString());
            b = Integer.parseInt(input2.getText().toString());
            RESULT = (TextView) findViewById(R.id.result);
            RESULT.setText(String.valueOf(a % b));
        }
    }

    public void DoClear(View view){
        input1=(EditText)findViewById(R.id.t1);
        input2=(EditText)findViewById(R.id.t2);
        input1.setText("");
        input2.setText("");
        RESULT = (TextView) findViewById(R.id.result);
        RESULT.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

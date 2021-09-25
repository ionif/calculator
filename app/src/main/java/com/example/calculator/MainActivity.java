package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void addFunction(View view) {
        EditText textField = (EditText) findViewById(R.id.textField);
        EditText textField2 = (EditText) findViewById(R.id.textField2);
        Integer sum = Integer.parseInt(textField.getText().toString()) + Integer.parseInt(textField2.getText().toString());
        gotoActivity2(sum.toString());
    }

    public void subtractFunction(View view) {
        EditText textField = (EditText) findViewById(R.id.textField);
        EditText textField2 = (EditText) findViewById(R.id.textField2);
        Integer out = Integer.parseInt(textField.getText().toString()) - Integer.parseInt(textField2.getText().toString());
        gotoActivity2(out.toString());
    }

    public void multiplyFunction(View view) {
        EditText textField = (EditText) findViewById(R.id.textField);
        EditText textField2 = (EditText) findViewById(R.id.textField2);
        Integer out = Integer.parseInt(textField.getText().toString()) * Integer.parseInt(textField2.getText().toString());
        gotoActivity2(out.toString());
    }

    public void divideFunction(View view) {
        EditText textField = (EditText) findViewById(R.id.textField);
        EditText textField2 = (EditText) findViewById(R.id.textField2);
        Integer out = Integer.parseInt(textField.getText().toString()) / Integer.parseInt(textField2.getText().toString());
        gotoActivity2(out.toString());
    }

    public void gotoActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumButton(View v){
        EditText first = (EditText)findViewById(R.id.num1);
        EditText second = (EditText)findViewById(R.id.num2);
        TextView res = (TextView)findViewById(R.id.result);
        int number1 = Integer.parseInt(first.getText().toString());
        int number2 = Integer.parseInt(second.getText().toString());
        int result = number1 + number2;
        res.setText(Integer.toString(result));
    }

    public void minusButton(View v){
        EditText first = (EditText)findViewById(R.id.num1);
        EditText second = (EditText)findViewById(R.id.num2);
        TextView res = (TextView)findViewById(R.id.result);
        int number1 = Integer.parseInt(first.getText().toString());
        int number2 = Integer.parseInt(second.getText().toString());
        int result = number1 - number2;
        res.setText(Integer.toString(result));
    }

    public void multiButton(View v){
        EditText first = (EditText)findViewById(R.id.num1);
        EditText second = (EditText)findViewById(R.id.num2);
        TextView res = (TextView)findViewById(R.id.result);
        int number1 = Integer.parseInt(first.getText().toString());
        int number2 = Integer.parseInt(second.getText().toString());
        int result = number1 * number2;
        res.setText(Integer.toString(result));
    }

    public void divideButton(View v){
        EditText first = (EditText)findViewById(R.id.num1);
        EditText second = (EditText)findViewById(R.id.num2);
        TextView res = (TextView)findViewById(R.id.result);
        int number1 = Integer.parseInt(first.getText().toString());
        int number2 = Integer.parseInt(second.getText().toString());
        int result = number1 / number2;
        res.setText(Integer.toString(result));
    }
}

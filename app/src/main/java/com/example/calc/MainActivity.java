package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonClear;
    Button buttonDivide;
    Button buttonMulti;
    Button buttonClearOne;
    Button buttonSum;
    Button buttonMinus;
    Button buttonEqual;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonClearOne = (Button) findViewById(R.id.buttonClearOne);
        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testString = "";
                switch(v.getId()){
                    case R.id.button0:
                        testString += "0";
                        result.append(testString);
                        break;
                    case R.id.button1:
                        testString += "1";
                        result.append(testString);
                        break;
                    case R.id.button2:
                        testString += "2";
                        result.append(testString);
                        break;
                    case R.id.button3:
                        testString += "3";
                        result.append(testString);
                        break;
                    case R.id.button4:
                        testString += "4";
                        result.append(testString);
                        break;
                    case R.id.button5:
                        testString += "5";
                        result.append(testString);
                        break;
                    case R.id.button6:
                        testString += "6";
                        result.append(testString);
                        break;
                    case R.id.button7:
                        testString += "7";
                        result.append(testString);
                        break;
                    case R.id.button8:
                        testString += "8";
                        result.append(testString);
                        break;
                    case R.id.button9:
                        testString += "9";
                        result.append(testString);
                        break;
                    case R.id.buttonSum:
                        testString += "+";
                        result.append(testString);
                        break;
                    case R.id.buttonMinus:
                        testString += "-";
                        result.append(testString);
                        break;
                    case R.id.buttonDivide:
                        testString += "/";
                        result.append(testString);
                        break;
                    case R.id.buttonMulti:
                        testString += "*";
                        result.append(testString);
                        break;
                    case R.id.buttonClear:
                        testString = "";
                        result.setText(testString);
                        break;
                    case R.id.buttonClearOne:
                        testString = testString.substring(0,testString.length()-1);
                        result.setText(testString);
                        break;
                    case R.id.buttonEqual:
                        double resultNumber = getResult(v,testString);
                        String answer = Double.toString(resultNumber);
                        result.setText(answer);
                        break;
                }
            }
        };

        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonSum.setOnClickListener(onClickListener);
        buttonMinus.setOnClickListener(onClickListener);
        buttonDivide.setOnClickListener(onClickListener);
        buttonMulti.setOnClickListener(onClickListener);
        buttonClear.setOnClickListener(onClickListener);
        buttonClearOne.setOnClickListener(onClickListener);
        buttonEqual.setOnClickListener(onClickListener);
    }

    public double getResult (View view, String testString) {
        if (view.getId() == R.id.buttonEqual) {
            int i = 0;
            double result = 0;
            double firstOperand;
            double secondOperand;
            String numberOne = "";
            String numberTwo = "";
            String plus = "+";
            String minus = "-";
            String multi = "*";
            String divide = "/";
            Character finalOperation = null;
            while (i <= testString.length()) {
                if (testString.contains(plus) || testString.contains(minus) || testString.contains(multi) || testString.contains(divide)) {
                    finalOperation = testString.toCharArray()[i];
                    i++;
                } else {
                    numberOne += testString.toCharArray()[i];
                    i++;
                }
                if (finalOperation != null) {
                    numberTwo += testString.toCharArray()[i];
                }
                firstOperand = Double.valueOf(numberOne);
                secondOperand = Double.valueOf(numberTwo);
                switch (finalOperation) {
                    case '+':
                        result = firstOperand + secondOperand;
                        return result;
                    case '-':
                        result = firstOperand - secondOperand;
                        return result;
                    case '*':
                        result = firstOperand * secondOperand;
                        return result;
                    case '/':
                        result = firstOperand / secondOperand;
                        return result;
                }

            }
        }
        return 0;
    }
}

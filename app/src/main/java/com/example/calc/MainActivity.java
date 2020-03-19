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
    String testString = "";

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

                switch(v.getId()){
                    case R.id.button0:
                        testString += "0";
                        result.setText(testString);
                        break;
                    case R.id.button1:
                        testString += "1";
                        result.setText(testString);
                        break;
                    case R.id.button2:
                        testString += "2";
                        result.setText(testString);
                        break;
                    case R.id.button3:
                        testString += "3";
                        result.setText(testString);
                        break;
                    case R.id.button4:
                        testString += "4";
                        result.setText(testString);
                        break;
                    case R.id.button5:
                        testString += "5";
                        result.setText(testString);
                        break;
                    case R.id.button6:
                        testString += "6";
                        result.setText(testString);
                        break;
                    case R.id.button7:
                        testString += "7";
                        result.setText(testString);
                        break;
                    case R.id.button8:
                        testString += "8";
                        result.setText(testString);
                        break;
                    case R.id.button9:
                        testString += "9";
                        result.setText(testString);
                        break;
                    case R.id.buttonSum:
                        testString += "+";
                        result.setText(testString);
                        break;
                    case R.id.buttonMinus:
                        testString += "-";
                        result.setText(testString);
                        break;
                    case R.id.buttonDivide:
                        testString += "/";
                        result.setText(testString);
                        break;
                    case R.id.buttonMulti:
                        testString += "*";
                        result.setText(testString);
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
                        double resultNumber = getResult(testString);
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

    public double getResult (String testString) {
            double result = 0;
            double firstOperand;
            double secondOperand;
            String numberOne = "";
            String numberTwo = "";
            Character plus = '+';
            Character minus = '-';
            Character multi = '*';
            Character divide = '/';
            Character finalOperation = null;
            for (int i = 0; i<testString.length(); i++) {
                if (testString.toCharArray()[i]==plus || testString.toCharArray()[i]==minus ||
                        testString.toCharArray()[i]==divide || testString.toCharArray()[i]==multi) {
                    finalOperation = testString.toCharArray()[i];
                    i++;
                }
                if (finalOperation==null)
                numberOne+=testString.toCharArray()[i];
                else
                    numberTwo+=testString.toCharArray()[i];
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
        return 0;
    }
}

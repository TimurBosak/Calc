package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

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
        result = findViewById(R.id.result);
        button0 =  findViewById(R.id.button0);
        button1 =  findViewById(R.id.button1);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);
        buttonClear =  findViewById(R.id.buttonClear);
        buttonDivide =  findViewById(R.id.buttonDivide);
        buttonMulti =  findViewById(R.id.buttonMulti);
        buttonClearOne =  findViewById(R.id.buttonClearOne);
        buttonSum =  findViewById(R.id.buttonSum);
        buttonMinus =  findViewById(R.id.buttonMinus);
        buttonEqual =  findViewById(R.id.buttonEqual);

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
                        if (testString.length()==0)
                            break;
                        else {
                            testString = testString.substring(0, testString.length() - 1);
                            result.setText(testString);
                            break;
                        }
                    case R.id.buttonEqual:
                        PolishParse n = new PolishParse();
                        List<String> exp = n.parse(testString);
                        boolean flag = n.flag;
                        if (flag){
                            double answer = Calculator.calc(exp);
                            result.setText(Double.toString(answer));
                        }
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


}

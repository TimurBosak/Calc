package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonOpen;
    Button buttonClose;
    Button buttonPow0;
    Button buttonPow2;
    Button buttonPow3;
    Button buttonPowY;
    Button buttonFact;
    Button buttonSqrt;
    Button buttonSin;
    Button buttonCos;
    Button buttonTan;
    Button buttonCtg;
    Button buttonPi;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button32;
    Button button33;
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
        button32 = findViewById(R.id.button32);
        result = findViewById(R.id.result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonClear = findViewById(R.id.buttonClear);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonClearOne = findViewById(R.id.buttonClearOne);
        buttonSum = findViewById(R.id.buttonSum);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonEqual = findViewById(R.id.buttonEqual);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            button33 = findViewById(R.id.button33);
            buttonOpen = findViewById(R.id.buttonOpen);
            buttonClose = findViewById(R.id.buttonClose);
            buttonPow0 = findViewById(R.id.buttonPow0);
            buttonPow2 = findViewById(R.id.buttonPow2);
            buttonPow3 = findViewById(R.id.buttonPow3);
            buttonPowY = findViewById(R.id.buttonPowY);
            buttonFact = findViewById(R.id.buttonFact);
            buttonSqrt = findViewById(R.id.buttonSqrt);
            buttonSin = findViewById(R.id.buttonSin);
            buttonCos = findViewById(R.id.buttonCos);
            buttonTan = findViewById(R.id.buttonTan);
            buttonCtg = findViewById(R.id.buttonCtg);
            buttonPi = findViewById(R.id.buttonPi);
        }

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button33:
                        if (doubleOperationError(testString))
                            break;
                        testString += "%";
                        result.setText(testString);
                        break;
                    case R.id.button32:
                        testString += ".";
                        result.setText(testString);
                        break;
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
                        if (doubleOperationError(testString))
                            break;
                        testString += "+";
                        result.setText(testString);
                        break;
                    case R.id.buttonMinus:
                        if (doubleOperationError(testString))
                            break;
                        testString += "-";
                        result.setText(testString);
                        break;
                    case R.id.buttonDivide:
                        if (doubleOperationError(testString))
                            break;
                        testString += "/";
                        result.setText(testString);
                        break;
                    case R.id.buttonMulti:
                        if (doubleOperationError(testString))
                            break;
                        testString += "*";
                        result.setText(testString);
                        break;
                    case R.id.buttonClear:
                        testString = "";
                        result.setText(testString);
                        break;
                    case R.id.buttonClearOne:
                        if (testString.length() == 0)
                            break;
                        else {
                            testString = testString.substring(0, testString.length() - 1);
                            result.setText(testString);
                            break;
                        }
                    case R.id.buttonEqual:
                        if (notEndedInfix(testString))
                            break;
                        String postfix = PolishParse.getPostfix(testString);
                        double answer = Calculator.calculate(postfix);
                            result.setText(Double.toString(answer));
                        break;

                    case R.id.buttonOpen:
                        testString += "(";
                        result.setText(testString);
                        break;
                    case R.id.buttonClose:
                        testString += ")";
                        result.setText(testString);
                        break;
                    case R.id.buttonPi:
                        testString += "π";
                        result.setText(testString);
                        break;
                    case R.id.buttonPow0:
                        String powPostfix = PolishParse.getPostfix(testString);
                        double powAnswer = 1/Calculator.calculate(powPostfix);
                        result.setText(Double.toString(powAnswer));
                        break;
                    case R.id.buttonPow2:
                        testString += "^(2)";
                        result.setText(testString);
                        break;
                    case R.id.buttonPow3:
                        testString += "^(3)";
                        result.setText(testString);
                        break;
                    case R.id.buttonPowY:
                        testString += "^(";
                        result.setText(testString);
                        break;
                    case R.id.buttonFact:
                        testString += "!";
                        result.setText(testString);
                        break;
                    case R.id.buttonSqrt:
                        testString += "√(";
                        result.setText(testString);
                        break;
                    case R.id.buttonSin:
                        testString += "sin(";
                        result.setText(testString);
                        break;
                    case R.id.buttonCos:
                        testString += "cos(";
                        result.setText(testString);
                        break;
                    case R.id.buttonTan:
                        testString += "tan(";
                        result.setText(testString);
                        break;
                    case R.id.buttonCtg:
                        testString += "ctg(";
                        result.setText(testString);
                        break;

                }
            }
        };

        button32.setOnClickListener(onClickListener);
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
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            button33.setOnClickListener(onClickListener);
            buttonOpen.setOnClickListener(onClickListener);
            buttonClose.setOnClickListener(onClickListener);
            buttonPow0.setOnClickListener(onClickListener);
            buttonPow2.setOnClickListener(onClickListener);
            buttonPow3.setOnClickListener(onClickListener);
            buttonPowY.setOnClickListener(onClickListener);
            buttonFact.setOnClickListener(onClickListener);
            buttonSqrt.setOnClickListener(onClickListener);
            buttonSin.setOnClickListener(onClickListener);
            buttonCos.setOnClickListener(onClickListener);
            buttonTan.setOnClickListener(onClickListener);
            buttonCtg.setOnClickListener(onClickListener);
            buttonPi.setOnClickListener(onClickListener);
        }
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textView", testString);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        testString = savedInstanceState.getString("textView");
        result.setText(testString);
    }

    public boolean doubleOperationError(String input){
        switch (input.charAt(input.length()-1)){
            case '*':
            case '/':
            case '%':
            case '-':
            case '+':
                return true;
        }
        return false;
    }

    public boolean notEndedInfix (String input){
        int openBracket = 0;
        int closeBracket = 0;
        switch (input.charAt(input.length()-1)){
            case '*':
            case '/':
            case '%':
            case '-':
            case '+':
                return true;
        }
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i)=='(')
                openBracket++;
            if (input.charAt(i)==')')
                closeBracket++;
        }
        if (openBracket!=closeBracket)
            return true;
        return false;
    }
}

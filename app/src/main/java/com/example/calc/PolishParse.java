package com.example.calc;

import java.util.Stack;

public class PolishParse {
    public static boolean isFunction(char token) {
        if (token == 's' || token == 'c' || token == 't')
            return true;
        return false;
    }

    public static boolean isSqrt(char token){
        if (token =='√') return true;
        return false;
    }

    public static boolean isOperation(char token) {
        if (token == '+' || token == '*' || token == '/' || token == '-' || token=='^' || token=='%')
            return true;
        return false;
    }

    public static boolean isNumberOrSmth(char token) {
        if (token == '.' || token == '1' || token == '2'
                || token == '3' || token == '4' || token == '5' || token == '6'
                || token == '7' || token == '8' || token == '9' || token == '0')
            return true;
        return false;
    }

    public static int getPriority(char token) {
        switch (token) {
            case '(':
            case ')':
                return 1;
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
            case '%':
                return 3;
            default:
                return 4;
        }
    }

    public static String getPostfix(String infix) {
        Stack<String> stack = new Stack<>();
        String result = new String();
        for (int i = 0; i < infix.length(); i++) {
            if (isNumberOrSmth(infix.charAt(i)) || infix.charAt(i)=='!' || infix.charAt(i)=='π') result = result.concat(infix.substring(i, i + 1));
            else result = result.concat(" ");
            if (isFunction(infix.charAt(i))) {
                stack.push(infix.substring(i, i + 3));
                i+=2;
            }
            if (isSqrt(infix.charAt(i))) stack.push(infix.substring(i,i+1));
            if (infix.charAt(i) == '(') stack.push(infix.substring(i, i + 1));
            if (infix.charAt(i) == ')') {
                while (stack.peek() != "("){
                    if (stack.peek().equals("(")) break;
                    result += stack.pop();
                }
                stack.pop();
            }
            if (isOperation(infix.charAt(i)) && !stack.isEmpty()) {
                if (getPriority(infix.charAt(i)) <= getPriority(stack.peek().charAt(0)) || stack.peek().length() == 3) {
                    result += stack.pop();
                }
                stack.push(infix.substring(i, i + 1));
            }
            else if (stack.isEmpty() && isOperation(infix.charAt(i))) stack.push(infix.substring(i,i+1));
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
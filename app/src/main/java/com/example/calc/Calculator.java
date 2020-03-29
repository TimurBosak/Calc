package com.example.calc;

import java.util.Stack;

public class Calculator {
    public static Double calculate(String postfix) {
        Stack<Double> stack = new Stack<>();
        int index = 0;
        Double temp;
        for(int i = 0; i < postfix.length(); i++) {
            if (PolishParse.isNumberOrSmth(postfix.charAt(i))) {
                index++;
                if (index==postfix.length()) return Double.parseDouble(postfix.substring(0,index));
            }
        }
        for(int i = 0; i < postfix.length(); i++){
            if(PolishParse.isNumberOrSmth(postfix.charAt(i))){
                index = i;
                for(; PolishParse.isNumberOrSmth(postfix.charAt(i)); i++);
                stack.push(Double.parseDouble(postfix.substring(index, i)));
                i--;
            }else{
                switch (postfix.charAt(i)){
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        if (stack.size()==1){ stack.push(0-stack.pop()); break;}
                        else {temp = stack.pop();
                            stack.push(stack.pop() - temp);
                            break;}
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '%':
                        stack.push(stack.pop() * stack.pop()/100);
                        break;
                    case '/':
                        temp = stack.pop();
                        stack.push(stack.pop() / temp);
                        break;
                    case '^':
                        temp = stack.pop();
                        stack.push(Math.pow(stack.pop(), temp));
                        break;
                    case 's':
                        i += 2;
                        stack.push(Math.sin(stack.pop()));
                        break;
                    case 'c':
                        if(postfix.charAt(i + 1) == 'o')
                            stack.push(Math.cos(stack.pop()));
                        else
                            stack.push(1.0 / Math.tan(stack.pop()));
                        i += 2;
                        break;
                    case 't':
                        i += 2;
                        stack.push(Math.tan(stack.pop()));
                        break;
                    case 'e':
                        stack.push(2.74);
                        break;
                    case '!':
                        stack.push((double) fact((int) (double) stack.pop()));
                        break;
                    case '√':
                        stack.push(Math.sqrt(stack.pop()));
                        break;
                    case 'π':
                        stack.push(3.14);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static int fact(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}

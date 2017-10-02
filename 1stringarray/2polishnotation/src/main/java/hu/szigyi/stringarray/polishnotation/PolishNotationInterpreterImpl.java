package hu.szigyi.stringarray.polishnotation;

import java.util.Stack;

public class PolishNotationInterpreterImpl implements PolishNotationInterpreter {

    @Override
    public long interpret(String[] tokens) {
        Stack<Long> stack = new Stack<>();

        for (String token : tokens) {

            switch (token) {
                case "+": {
                    Long second = stack.pop();
                    Long first = stack.pop();
                    Long result = first + second;
                    stack.push(result);
                } break;
                case "-": {
                    Long second = stack.pop();
                    Long first = stack.pop();
                    Long result = first - second;
                    stack.push(result);
                } break;
                case "/": {
                    Long second = stack.pop();
                    Long first = stack.pop();
                    Long result = first / second;
                    stack.push(result);
                } break;
                case "*": {
                    Long second = stack.pop();
                    Long first = stack.pop();
                    Long result = first * second;
                    stack.push(result);
                } break;
                default: {
                    long number = Long.parseLong(token);
                    stack.push(number);
                }
            }
        }
        return stack.pop();
    }
}

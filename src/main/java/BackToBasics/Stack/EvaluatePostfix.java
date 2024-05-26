package BackToBasics.Stack;

import java.util.Stack;

public class EvaluatePostfix {


    private int evaluatePostFix(String expression) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char c = expression.charAt(i);

            if (!Character.isDigit(c)) {
                int x = stack.pop();
                int y = stack.pop();

                switch (c) {

                    case '+':
                        stack.push(y + x);
                        break;

                    case '-':
                        stack.push(y - x);
                        break;

                    case '*':
                        stack.push(y * x);
                        break;

                    case '/':
                        stack.push(y / x);
                        break;
                }
            } else {

                stack.push(Character.getNumericValue(c));
            }
        }

        return stack.pop();
    }


    public static void main(String[] args) {


        String str = "45+3*";

        EvaluatePostfix evaluatePostfix = new EvaluatePostfix();

        int postFixExpressionResult = evaluatePostfix.evaluatePostFix(str);

        System.out.println(" Post Fix Expression Evaluation result is : " + postFixExpressionResult);
    }
}

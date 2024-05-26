package BackToBasics.Stack;

import java.util.Stack;

public class ReverseString {


    private String reverse(String str) {

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();

        for (char x : chars) {
            stack.push(x);
        }


        for (int i = 0; i < str.length(); i++) {

            chars[i] = stack.pop();
        }


        return new String(chars);
    }


    public static void main(String[] args) {

        String str = "saurabh";
        ReverseString reverseString = new ReverseString();

        String reverse = reverseString.reverse(str);

        System.out.println(" Reversed String is ::: " + reverse);
    }
}

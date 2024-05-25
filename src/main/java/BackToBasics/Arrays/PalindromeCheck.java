package BackToBasics.Arrays;

public class PalindromeCheck {


    private boolean isPalindrome(String str) {

        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            if (chars[start] != chars[end]) return false;

            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {


        String str = "radarx";

        PalindromeCheck palindromeCheck = new PalindromeCheck();

        boolean palindrome = palindromeCheck.isPalindrome(str);

        System.out.println(" Is the String Palindrome ? ::: " + palindrome);
    }
}

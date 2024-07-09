package BackToBasics.MSOA.Next.DSA;

public class LongestPalindromicSubstring {


    public String longestPalindromicSubstring(String str) {

        if (str.length() <= 1) return str;


        String longestPalindromicSubstring = "";


        for (int i = 1; i < str.length(); i++) {


            int low = i;
            int high = i;

            while (str.charAt(low) == str.charAt(high)) {

                low--;
                high++;

                if (low == -1 || high == str.length()) {
                    break;
                }
            }


            String palindrome = str.substring(low + 1, high);

            if (palindrome.length() > longestPalindromicSubstring.length()) {

                longestPalindromicSubstring = palindrome;
            }


            low = i - 1;
            high = i;

            while (str.charAt(low) == str.charAt(high)) {

                low--;
                high++;

                if (low == -1 || high == str.length()) {

                    break;
                }
            }


            palindrome = str.substring(low + 1, high);

            if (palindrome.length() > longestPalindromicSubstring.length()) {

                longestPalindromicSubstring = palindrome;
            }
        }


        return longestPalindromicSubstring;
    }


    public static void main(String[] args) {


        String str = "ABRBADAADAB";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

        String longestPalindromicSubstring1 = longestPalindromicSubstring.longestPalindromicSubstring(str);

        System.out.println(" Longest Palindromic String ::: " + longestPalindromicSubstring1);
    }
}

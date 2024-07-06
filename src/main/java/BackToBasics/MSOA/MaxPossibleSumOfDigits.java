package BackToBasics.MSOA;

public class MaxPossibleSumOfDigits {


    public String maxPossibleSumOfDigits(String str) {

        StringBuilder sb = new StringBuilder();

        if (str.charAt(0) != '1') sb.append(str.charAt(0) - 1);

        for (int i = 1; i < str.length(); i++) {
            sb.append('9');
        }

        return new String(sb);
    }

    public String getMaxDigitSumNum2(String input) {
        StringBuffer sb = new StringBuffer();
        if (input.charAt(0) != '1') sb.append(input.charAt(0)-1);
        for (int I = 1; I < input.length(); I++) {
            sb.append('9');
        }
        return new String(sb);
    }


    public static void main(String[] args) {

        String str = "899";

        MaxPossibleSumOfDigits maxPossibleSumOfDigits = new MaxPossibleSumOfDigits();

        System.out.println(maxPossibleSumOfDigits.getMaxDigitSumNum2(str));
    }
}

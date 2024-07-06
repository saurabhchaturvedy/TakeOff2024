package BackToBasics.MSOA;

import java.util.HashMap;
import java.util.Map;

public class LongestArithmeticSequence {


    int longestLengthSequence(int[] arr) {

        int maxLength = 0;

        Map<Integer, Integer>[] dp = new HashMap[arr.length];

        for (int i = 0; i < arr.length; i++) {

            dp[i] = new HashMap<>();

            for (int j = 0; j < i; j++) {

                int diff = arr[j] - arr[i];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1);
                maxLength = Math.max(maxLength, dp[i].get(diff));
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {

        int[]arr = {12,12,12,15,13,14};

        LongestArithmeticSequence longestArithmeticSequence = new LongestArithmeticSequence();

        System.out.println(longestArithmeticSequence.longestLengthSequence(arr));

    }
}

package BackToBasics.MSOA;

import java.util.HashMap;
import java.util.Map;

public class MaxNumbersInSequence {


    int maxNumbersInSequence(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return n;
        }

        Map<Integer, Map<Integer, Integer>> dp = new HashMap<>();
        int maxLength = 1;

        for (int i = 0; i < arr.length; i++) {

            dp.put(i, new HashMap<>());

            for (int j = 0; j < i; j++) {
                int diff = arr[i] - arr[j];
                dp.get(i).put(diff, dp.get(j).getOrDefault(diff, 1) + 1);

                maxLength = Math.max(maxLength, dp.get(i).get(diff));
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {


        int[] arr1 = {12, 12, 12, 15, 13, 14};

        MaxNumbersInSequence maxNumbersInSequence = new MaxNumbersInSequence();

        System.out.println(maxNumbersInSequence.maxNumbersInSequence(arr1));
    }
}

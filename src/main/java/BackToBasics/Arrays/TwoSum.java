package BackToBasics.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] arr, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(target - arr[i])) {

                map.put(arr[i], i);
            } else {

                result[0] = map.get(target - arr[i]);
                result[1] = i;
            }
        }

        return result;
    }


    public static void main(String[] args) {


        int[] arr = {2, 11, 5, 10, 7, 8};

        TwoSum twoSum = new TwoSum();


        int sum = 9;

        int[] twoSumIndices = twoSum.twoSum(arr, sum);

        System.out.println(" Indices for the sum  " + sum + " are : " + twoSumIndices[0] + " " + twoSumIndices[1]);
    }
}

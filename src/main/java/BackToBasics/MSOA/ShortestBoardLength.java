package BackToBasics.MSOA;

import java.util.Arrays;

public class ShortestBoardLength {


    public int shortestBoardLength(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];

        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (canCoverTheHoles(arr, mid)) {


                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canCoverTheHoles(int[] arr, int length) {

        int count = 1;
        int firstBoardEnd = arr[0] + length;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > firstBoardEnd) {
                count++;
                firstBoardEnd = arr[i] + length;

                if (count > 2) {
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {

        int[] arr = {0, 44, 32,30,42,18,34,16,35};

        ShortestBoardLength shortestBoardLength = new ShortestBoardLength();

        System.out.println(shortestBoardLength.shortestBoardLength(arr));
    }
}

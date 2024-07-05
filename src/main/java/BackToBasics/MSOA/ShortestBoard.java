package BackToBasics.MSOA;

import java.util.Arrays;

public class ShortestBoard {


    public int solution(int[] arr) {


        Arrays.sort(arr);

        int min = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            int leftSize = arr[i] - arr[0];
            int rightSize = arr[arr.length - 1] - arr[i + 1];
            int max = Math.max(leftSize, rightSize);
            if (max < min) {
                min = max;
            } else {
                break;
            }
        }


        return min;
    }






    public static void main(String[] args) {

        int[] arr = {11, 20, 15};

        ShortestBoard shortestBoard = new ShortestBoard();

        System.out.println(shortestBoard.solution(arr));
    }
}

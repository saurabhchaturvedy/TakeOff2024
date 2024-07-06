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


    public int shortestBox(int[] A) {
        int N = A.length;
        if (N == 0) {
            return 0;
        }

        Arrays.sort(A);

        int low = 1;
        int high = A[N - 1] - A[0];

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canCoverWithTwoBoards(A, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canCoverWithTwoBoards(int[] A, int length) {
        int N = A.length;
        int count = 1;
        int firstBoardEnd = A[0] + length;

        for (int i = 1; i < N; i++) {
            if (A[i] > firstBoardEnd) {
                count++;
                firstBoardEnd = A[i] + length;
                if (count > 2) {
                    return false;
                }
            }
        }

        return true;
    }






    public static void main(String[] args) {

        int[] arr = {11, 20, 15};

        ShortestBoard shortestBoard = new ShortestBoard();

        System.out.println(shortestBoard.solution(arr));

        System.out.println(shortestBoard.shortestBox(arr));
    }
}

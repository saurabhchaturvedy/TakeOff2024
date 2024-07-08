package BackToBasics.MSOA.Next;

public class SpiralMatrix {


    public void spiralMatrix(int[][] arr) {

        int top = 0;

        int bottom = arr.length - 1;

        int left = 0;

        int right = arr[0].length - 1;


        while (top <= bottom && left <= right) {


            for (int i = left; i <= right; i++) {

                System.out.print(arr[top][i]+" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {

                System.out.print(arr[i][right]+" ");
            }
            right--;

            if (left <= right) {

                for (int i = right; i >= left; i--) {

                    System.out.println(arr[bottom][i]+" ");
                }

                bottom--;
            }

            if (top <= bottom) {

                for (int i = bottom; i >= top; i--) {

                    System.out.println(arr[i][left]+" ");
                }

                left++;
            }
        }

    }


    public static void main(String[] args) {


        int[][]arr = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };


        SpiralMatrix spiralMatrix = new SpiralMatrix();

        spiralMatrix.spiralMatrix(arr);
    }
}

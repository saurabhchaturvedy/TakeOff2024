package BackToBasics.Arrays;

public class ReverseArray {


    private int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        ReverseArray reverseArray = new ReverseArray();

        int[] reverse = reverseArray.reverse(arr);

        for (int x : reverse) {
            System.out.print(x + " ");
        }
    }
}

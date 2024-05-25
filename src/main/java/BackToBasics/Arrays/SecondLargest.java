package BackToBasics.Arrays;

import java.util.NoSuchElementException;

public class SecondLargest {


    public int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];

            } else if (arr[i] > second && arr[i] != first) {

                second = arr[i];
            }
        }


        if (second == Integer.MIN_VALUE) {
            throw new NoSuchElementException("Second largest element not found");
        }

        return second;
    }


    public static void main(String[] args) {


        int[] arr = {13, 9, 2, 18, 11, 27, 21, 3, 16};

        SecondLargest secondLargest = new SecondLargest();

        int secondedLargest = secondLargest.secondLargest(arr);

        System.out.println(" Second Largest Element is : " + secondedLargest);
    }
}

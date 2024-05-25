package BackToBasics.Arrays;

public class MaximumElement {


    private int maxElement(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int[] arr = {13, 9, 2, 18, 11, 27, 21, 3, 16};

        MaximumElement maximumElement = new MaximumElement();

        int maxElement = maximumElement.maxElement(arr);

        System.out.println(" Max Element Is : " + maxElement);
    }
}

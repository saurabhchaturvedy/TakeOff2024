package BackToBasics.Arrays;

public class MinimumElement {


    private int minElement(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {


        int[] arr = {13, 9, 2, 18, 11, 27, 21, 3, 16};
        MinimumElement minimumElement = new MinimumElement();

        int minElement = minimumElement.minElement(arr);
        System.out.println("Minimum Element Is : " + minElement);
    }
}

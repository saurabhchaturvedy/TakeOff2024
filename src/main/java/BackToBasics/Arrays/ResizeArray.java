package BackToBasics.Arrays;

public class ResizeArray {


    public int[] resizeArray(int[] arr, int capacity) {

        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {

            temp[i] = arr[i];
        }

        arr = temp;
        return arr;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6};


        ResizeArray resizeArray = new ResizeArray();

        int[] x = resizeArray.resizeArray(arr, 10);

        System.out.println(" Array Length : " + x.length);
    }
}

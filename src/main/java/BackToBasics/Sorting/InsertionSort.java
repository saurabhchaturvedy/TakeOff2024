package BackToBasics.Sorting;

public class InsertionSort {


    public void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;
        }
    }


    public void print(int[] arr) {

        System.out.println(" Array : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {5, 1, 9, 2, 10};

        InsertionSort insertionSort = new InsertionSort();


        insertionSort.print(arr);
        insertionSort.insertionSort(arr);

        System.out.println();

        insertionSort.print(arr);
    }
}

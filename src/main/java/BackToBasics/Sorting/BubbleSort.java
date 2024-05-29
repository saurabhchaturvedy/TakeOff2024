package BackToBasics.Sorting;

public class BubbleSort {


    public void bubbleSort(int[] arr) {

        boolean isSwapped = false;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            if (!isSwapped) break;
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


        BubbleSort bs = new BubbleSort();

        int[] arr = {3, 1, 5, 2, 6, 4};

        bs.print(arr);
        bs.bubbleSort(arr);
        bs.print(arr);
    }
}

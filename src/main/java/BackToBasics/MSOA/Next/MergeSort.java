package BackToBasics.MSOA.Next;

public class MergeSort {


    public void mergeSort(int[] arr, int left, int right) {


        if (left < right) {


            int mid = (left + right) >>> 1;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {


        int n1 = mid - left + 1;
        int n2 = right - mid;


        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];


        for (int i = 0; i < n1; i++) {

            leftArray[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {

            rightArray[i] = arr[mid + 1 + i];
        }


        int i = 0;
        int j = 0;
        int k = left;


        while (i < leftArray.length && j < rightArray.length) {

            if (leftArray[i] <= rightArray[j]) {

                arr[k] = leftArray[i];
                i++;
            } else {

                arr[k] = rightArray[j];
                j++;
            }

            k++;
        }


        while (i < leftArray.length) {

            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length) {

            arr[k] = rightArray[j];
            j++;
            k++;

        }


    }


    public static void main(String[] args) {


        int[] array = {38, 27, 43, 3, 9, 82, 10};

        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(array, 0, array.length - 1);

        System.out.println(" Merged Array : ");
        for (int l = 0; l < array.length; l++) {

            System.out.print(array[l] + " ");
        }
    }
}

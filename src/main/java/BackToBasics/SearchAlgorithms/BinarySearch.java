package BackToBasics.SearchAlgorithms;

public class BinarySearch {


    private boolean isPresent(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {

            int mid = (low + high) >>> 1;

            if (arr[mid] == target) {
                return true;
            }

            if (target < arr[mid]) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }


        return false;
    }


    public static void main(String[] args) {


        int[] arr = {2, 7, 11, 16, 19, 24, 29, 33, 41};

        BinarySearch binarySearch = new BinarySearch();

        boolean present = binarySearch.isPresent(arr, 33);

        System.out.println(" Is the element present ? :::: " + present);
    }
}

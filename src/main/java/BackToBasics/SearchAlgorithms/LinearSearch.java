package BackToBasics.SearchAlgorithms;

public class LinearSearch {


    public boolean isPresent(int[] arr, int target) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {


        int[] arr = {18, 9, 3, 6, 12, 11, 29, 33, 47, 8};

        LinearSearch linearSearch = new LinearSearch();

        boolean present = linearSearch.isPresent(arr, 6);

        System.out.println(" Is element present ? ::: " + present);
    }
}

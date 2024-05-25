package BackToBasics.Matrix;

public class SearchElement {


    public boolean isPresent(int[][] arr, int item) {
        int i = 0;
        int n = arr.length;
        int j = n - 1;


        while (i < n && j >= 0) {

            if (arr[i][j] == item) return true;

            if (arr[i][j] > item) {
                j--;
            } else {

                i++;
            }
        }

        return false;
    }


    public static void main(String[] args) {


        int[][] arr = {

                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150},
                {160, 170, 180, 190, 200}

        };


        SearchElement searchElement = new SearchElement();

        boolean present = searchElement.isPresent(arr, 90);

        System.out.println(" Is the searched element present ? :::: " + present);


    }

}
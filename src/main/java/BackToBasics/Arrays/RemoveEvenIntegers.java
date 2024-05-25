package BackToBasics.Arrays;

public class RemoveEvenIntegers {


    public int[] removeEvenIntegers(int[] arr) {

        int oddIntegers = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                oddIntegers++;
            }
        }


        int[] finalArray = new int[oddIntegers];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                finalArray[index] = arr[i];
                index++;
            }
        }

        return finalArray;
    }


    public static void main(String[] args) {


        int[] arr = {7, 19, 20, 8, 11, 13, 14, 21, 29, 24, 88};

        RemoveEvenIntegers removeEvenIntegers = new RemoveEvenIntegers();

        int[] ints = removeEvenIntegers.removeEvenIntegers(arr);

        System.out.println("Array after removing Even Integers :::: ");

        for (int x : ints) {
            System.out.print(x + " ");
        }
    }
}

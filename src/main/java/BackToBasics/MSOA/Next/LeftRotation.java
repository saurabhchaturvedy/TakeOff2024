package BackToBasics.MSOA.Next;

public class LeftRotation {


    public void leftRotation(int[] arr, int rotationCount) {


        for (int k = 1; k <= rotationCount; k++) {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {

                arr[i - 1] = arr[i];

            }

            arr[arr.length - 1] = temp;
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        LeftRotation leftRotation = new LeftRotation();

        leftRotation.leftRotation(arr, 2);

        for (int x : arr) {

            System.out.print(x + " ");
        }
    }
}

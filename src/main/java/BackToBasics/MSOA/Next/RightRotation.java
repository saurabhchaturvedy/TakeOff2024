package BackToBasics.MSOA.Next;

public class RightRotation {


    public void rightRotation(int[] arr, int rotationCount) {


        for (int k = 1; k < rotationCount; k++) {

            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {

                arr[i] = arr[i - 1];
            }

            arr[0] = temp;
        }
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        RightRotation rightRotation = new RightRotation();

        rightRotation.rightRotation(arr, 2);

        for (int x : arr) {

            System.out.print(x + " ");
        }
    }
}

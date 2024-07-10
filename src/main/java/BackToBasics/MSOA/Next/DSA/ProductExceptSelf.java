package BackToBasics.MSOA.Next.DSA;

public class ProductExceptSelf {


    public int[] productExceptSelf(int[] arr) {


        int[] result = new int[arr.length];

        int leftProduct = 1;

        for (int i = 0; i < arr.length; i++) {

            result[i] = leftProduct;

            leftProduct = leftProduct * arr[i];
        }


        int rightProduct = 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * arr[i];
        }


        return result;
    }


    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4};

        ProductExceptSelf productExceptSelf = new ProductExceptSelf();

        int[] ints = productExceptSelf.productExceptSelf(arr);

        for (int x : ints) {

            System.out.print(x + " ");
        }
    }
}

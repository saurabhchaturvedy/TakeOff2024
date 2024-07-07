package BackToBasics.DynamicProgramming;

public class Fibonacci {


    public int bottomUp(int n) {

        int[] table = new int[n + 1];

        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {

            table[i] = table[i - 1] + table[i - 2];
        }


        return table[n];
    }


    public static void main(String[] args) {


        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.bottomUp(5));
    }
}

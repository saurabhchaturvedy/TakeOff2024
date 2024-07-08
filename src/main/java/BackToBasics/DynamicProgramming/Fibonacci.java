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


    public int topDown(int[] memo, int n) {

        if (memo[n] == 0) {

            if (n < 2) {
                memo[n] = n;
            } else {

                int left = topDown(memo, n - 1);
                int right = topDown(memo, n - 2);

                memo[n] = left + right;
            }
        }

        return memo[n];
    }


    public static void main(String[] args) {


        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.bottomUp(5));
    }
}

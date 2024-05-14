package BackToBasics.AlgorithmAnalysis;

public class TimeComplexity {



    public int findSum(int n)
    {
        return n*(n+1)/2;
    }

    public int findSum2(int n)
    {

        int sum=0;

        for(int i=1; i<=n; i++)
        {
            sum = sum+i;

        }

        return sum;
    }
    public static void main(String[] args) {


        Long now = System.currentTimeMillis();

        TimeComplexity timeComplexity = new TimeComplexity();
        timeComplexity.findSum2(9999999);
        System.out.println("Time elapsed is : "+(System.currentTimeMillis()-now)+" ms ");

    }
}

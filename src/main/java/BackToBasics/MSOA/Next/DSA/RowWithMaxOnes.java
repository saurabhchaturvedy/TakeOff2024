package BackToBasics.MSOA.Next.DSA;

public class RowWithMaxOnes {


    int rowWithMaxOnes(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        int row = 0;
        int col = cols - 1;

        int rowWithMaxOnes = -1;


        while (row < rows && col >= 0) {


            if (arr[row][col] == 1) {

                rowWithMaxOnes = row;
                col--;
            } else {


                row++;
            }
        }

        return rowWithMaxOnes;
    }


    public static void main(String[] args) {


        int[][] arr = {
                {0, 0, 0, 1, 1},
                {0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1}

        };


        RowWithMaxOnes rowWithMaxOnes = new RowWithMaxOnes();

        int rowWithMaxOnes1 = rowWithMaxOnes.rowWithMaxOnes(arr);

        System.out.println(" Row with max ones is : " + rowWithMaxOnes1);
    }
}

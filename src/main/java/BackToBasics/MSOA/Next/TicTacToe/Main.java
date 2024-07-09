package BackToBasics.MSOA.Next.TicTacToe;

public class Main {


    public static void main(String[] args) {


        Player annu = new Player("Annu", 'X');
        Player saurabh = new Player("Saurabh", 'O');

        TicTacToe ticTacToe = new TicTacToe(3, annu, saurabh);

        ticTacToe.play();
    }
}

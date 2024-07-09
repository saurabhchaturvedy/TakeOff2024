package BackToBasics.MSOA.Next.TicTacToe;

import java.util.Scanner;

public class TicTacToe {


    Board board;
    Player player1;
    Player player2;

    Player currentPlayer;

    GameStatus status;


    TicTacToe(int size, Player player1, Player player2) {

        this.board = new Board(size);
        this.player1 = player1;
        this.player2 = player2;

        this.currentPlayer = player1;
        this.status = GameStatus.IN_PROGRESS;
    }


    public void play() {

        board.printBoard();
        Scanner scanner = new Scanner(System.in);


        while (status == GameStatus.IN_PROGRESS) {


            System.out.println(currentPlayer.name + " Please choose your move ( row , column)");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            while (!board.isValidMove(row, col)) {

                System.out.println(" Please enter a valid move value !!");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }


            Move move = currentPlayer.makeMove(row, col);
            board.placeMove(move, currentPlayer.symbol);
            board.printBoard();

            if (board.checkWin(move, currentPlayer.symbol)) {
                status = GameStatus.WIN;
                System.out.println(currentPlayer.name + " has won the game !!!");
                break;
            }

            if (board.isFull()) {

                status = GameStatus.DRAW;
                System.out.println("Game has ended in a draw !!");
                break;
            }

            switchPlayer();
        }
    }

    private void switchPlayer() {


        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}

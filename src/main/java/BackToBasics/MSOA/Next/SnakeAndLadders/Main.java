package BackToBasics.MSOA.Next.SnakeAndLadders;

public class Main {


    public static void main(String[] args) {

        SnakeAndLadders snakeAndLadders = new SnakeAndLadders();

        Player saurabh = new Player("Saurabh");
        Player annu = new Player("Annu");

        snakeAndLadders.addPlayer(saurabh);
        snakeAndLadders.addPlayer(annu);

        snakeAndLadders.play();
    }
}

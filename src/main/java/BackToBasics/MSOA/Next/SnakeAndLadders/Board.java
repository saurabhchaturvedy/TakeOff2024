package BackToBasics.MSOA.Next.SnakeAndLadders;

public class Board {

    int size;
    Cell[] cells;

    Board(int size) {
        this.size = size;
        this.cells = new Cell[size + 1];
        initializeBoard();
    }

    private void initializeBoard() {

        for (int i = 1; i < size; i++) {
            cells[i] = new Cell(i, i, CellType.NORMAl);
        }

        cells[size] = new Cell(size, size, CellType.TARGET);
        addSnake(new Snake(50, 10));
        addLadder(new Ladder(5, 30));
    }


    void addSnake(Snake snake) {
        cells[snake.start] = snake;
    }

    void addLadder(Ladder ladder) {
        cells[ladder.start] = ladder;
    }

    Cell getCell(int position) {
        return cells[position];
    }
}

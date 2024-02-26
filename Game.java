import java.util.Scanner;

public class Game {
    private Grid grid;
    private Player player;
    private Encounter encounter = new Encounter();
    private boolean onSecondGrid = false;

    public Game() {
        startNewGrid(3); // Start with a 3x3 grid
    }

    private void startNewGrid(int size) {
        grid = new Grid(size);
        player = new Player(size / 2, size / 2);
        grid.placePeg(player.getRow(), player.getCol());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            grid.displayGrid();
            System.out.println("Enter move direction (up, down, left, right) or 'quit' to exit:");
            String direction = scanner.nextLine();

            if (direction.equalsIgnoreCase("quit")) {
                System.out.println("Game Over.");
                break;
            }

            grid.removePeg(player.getRow(), player.getCol());
            player.move(direction, grid.getSize());
            grid.placePeg(player.getRow(), player.getCol());

            int position = player.getRow() * grid.getSize() + player.getCol() + 1;
            encounter.handleEncounter(position, onSecondGrid);

            if (position == 4 && !onSecondGrid) {
                onSecondGrid = true;
                startNewGrid(5);
            } else if (position == 9 && onSecondGrid) {
                onSecondGrid = false;
                startNewGrid(3);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        new Game().run();
    }
}

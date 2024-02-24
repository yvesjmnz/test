import java.util.*;
public class TitleScreen {
    private static final String GAME_TITLE = "ELDEN ROGUE";

    public static void display() {
        System.out.println("Welcome to " + GAME_TITLE);
        System.out.println(".OPTIONS.");
        System.out.println("[1] START");
        System.out.println("[2] EXIT");

        handleInput();
    }

    private static void handleInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    startGame();
                    break;
                case 2:
                    exitGame();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void startGame() {
        System.out.println("Starting the game...");
        // Initialize character creation screen
        CharacterCreationScreen.display();
    }

    private static void exitGame() {
        System.out.println("Exiting the game...");
        // Add code to close the game
    }
}

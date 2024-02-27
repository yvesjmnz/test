//should be working
import java.util.Scanner;

public class Main {
    private static final String GAME_TITLE = "ELDEN ROGUE";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the title screen
        System.out.println("Welcome to " + GAME_TITLE);
        System.out.println(".OPTIONS.");
        System.out.println("[1] START");
        System.out.println("[2] EXIT");

        // Handle user input
        int choice = 0;
        while (choice != 1 && choice != 2) {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    exitGame();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }

    private static void startGame(Scanner scanner) {
        System.out.println("Starting the game...");

        // Create character
        Player player = CharacterCreationScreen.createCharacter(scanner);

        // Display the game lobby screen with the created player
        GameLobbyScreen.display(player, scanner);
    }

    private static void exitGame() {
        System.out.println("Exiting the game...");
        // Add code to close the game
    }
}

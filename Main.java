import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the title screen
        TitleScreen.display();

        // Simulate the flow of the game
        boolean gameRunning = true;

        while (gameRunning) {
            // Prompt user for input
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            if (input.matches("\\d+")) { // Check if the input is a number
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        // Start new game
                        Player player = CharacterCreationScreen.createCharacter(scanner);
                        GameLobbyScreen.display(player);
                        break;
                    case 2:
                        // Exit the game
                        System.out.println("Exiting the game. Goodbye!");
                        gameRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

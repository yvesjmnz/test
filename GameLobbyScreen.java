import java.util.Scanner;

public class GameLobbyScreen {
    private static final String SCREEN_TITLE = "GAME LOBBY";

    public static void display(Player player, Scanner scanner) {
        boolean inLobby = true;

        while (inLobby) {
            System.out.println(SCREEN_TITLE);
            System.out.println(".OPTIONS.");
            System.out.println("[1] FAST TRAVEL");
            System.out.println("[2] LEVEL UP");
            System.out.println("[3] INVENTORY");
            System.out.println("[4] SHOP");
            System.out.println("[5] QUIT GAME");
            System.out.println(".DETAILS.");
            System.out.println("Name: " + player.getName());
            System.out.println("Job Class: " + player.getJobClass());
            System.out.println("Level: " + player.getLevel());
            System.out.println("Runes: " + player.getRunes());
            System.out.println("System Messages: ");
            System.out.println("HP: " + player.getHP());
            System.out.println("Endurance: " + player.getEndurance());
            System.out.println("Dexterity: " + player.getDexterity());
            System.out.println("Strength: " + player.getStrength());
            System.out.println("Intelligence: " + player.getIntelligence());
            System.out.println("Faith: " + player.getFaith());

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    fastTravel();
                    break;
                case 2:
                    player.levelUp();
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    openShop();
                    break;
                case 5:
                    quitGame();
                    inLobby = false; // Exit lobby
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void fastTravel() {
        // Implement fast travel feature
    }

    private static void viewInventory() {
        // Implement view inventory feature
    }

    private static void openShop() {
        // Implement open shop feature
    }

    private static void quitGame() {
        // Implement quit game feature
    }
}

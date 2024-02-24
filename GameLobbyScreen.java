import java.util.Scanner;

public class GameLobbyScreen {
    private static final String SCREEN_TITLE = "GAME LOBBY";
    private static final int MAX_NAME_LENGTH = 25;
    private static final int MAX_LEVEL = 50;

    public static void display(Player player) {
        System.out.println(SCREEN_TITLE);
        System.out.println(".OPTIONS.");
        System.out.println("[1] FAST TRAVEL");
        System.out.println("[2] LEVEL UP");
        System.out.println("[3] INVENTORY");
        System.out.println("[4] SHOP");
        System.out.println("[5] QUIT GAME");
        System.out.println(".DETAILS.");
        System.out.println("[1] Name: " + player.getName());
        System.out.println("[2] Job Class: " + player.getJobClass());
        System.out.println("[3] Level: " + player.getLevel());
        System.out.println("[4] Runes: " + player.getRunes());
        System.out.println("[5] System Messages: " + player.getSystemMessages());
        System.out.println("[6] HP: " + player.getHP());
        System.out.println("[7] Endurance: " + player.getEndurance());
        System.out.println("[8] Dexterity: " + player.getDexterity());
        System.out.println("[9] Strength: " + player.getStrength());
        System.out.println("[10] Intelligence: " + player.getIntelligence());
        System.out.println("[11] Faith: " + player.getFaith());

        handleInput(player);
    }

    private static void handleInput(Player player) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
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
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
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

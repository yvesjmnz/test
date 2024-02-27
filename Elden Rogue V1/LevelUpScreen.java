import java.util.Scanner;

public class LevelUpScreen {
    private Player player;

    public LevelUpScreen(Player player) {
        this.player = player;
    }

    public void display() {
        // Display the level up screen
        System.out.println("============ LEVEL UP SCREEN ============");
        System.out.println("Choose a stat to level up:");
        System.out.println("1. Health: " + player.getHP() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("2. Endurance: " + player.getEndurance() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("3. Dexterity: " + player.getDexterity() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("4. Strength: " + player.getStrength() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("5. Intelligence: " + player.getIntelligence() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("6. Faith: " + player.getFaith() + " (" + calculateRuneCost(player.getLevel()) + " runes)");
        System.out.println("7. BACK");
        System.out.println("======================================");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int selectedStatIndex = 0;

        // Handle user input
        switch (input) {
            case 1:
                selectedStatIndex = 0;
                break;
            case 2:
                selectedStatIndex = 1;
                break;
            case 3:
                selectedStatIndex = 2;
                break;
            case 4:
                selectedStatIndex = 3;
                break;
            case 5:
                selectedStatIndex = 4;
                break;
            case 6:
                selectedStatIndex = 5;
                break;
            case 7:
                return;
            default:
                System.out.println("Invalid input. Please try again.");
                display();
                return;
        }

        // Check if the player has enough runes
        if (player.getRunes() < calculateRuneCost(player.getLevel())) {
            System.out.println("You don't have enough runes. Please go back and earn more runes.");
            return;
        }

        // Increase the selected stat value and the player's level
        switch (selectedStatIndex) {
            case 0:
                player.setHP(player.getHP() + 1);
                break;
            case 1:
                player.setEndurance(player.getEndurance() + 1);
                break;
            case 2:
                player.setDexterity(player.getDexterity() + 1);
                break;
            case 3:
                player.setStrength(player.getStrength() + 1);
                break;
            case 4:
                player.setIntelligence(player.getIntelligence() + 1);
                break;
            case 5:
                player.setFaith(player.getFaith() + 1);
                break;
        }
        player.setRunes(calculateRuneCost(player.getLevel()));
        player.setLevel(player.getLevel() + 1);

        // Calculate the new rune cost
        int newRuneCost = calculateRuneCost(player.getLevel());

        // Display a system message
        System.out.println("You have leveled up " + getStatName(selectedStatIndex) + " to " + getStatValue(selectedStatIndex) + "!");
        System.out.println("New rune cost: " + newRuneCost + " runes.");

        // Display the updated level up screen
        display();
    }

    private int calculateRuneCost(int level) {
        return (level * 100) / 2;
    }

    public String getStatName(int statIndex) {
        switch (statIndex) {
            case 0:
                return "Health";
            case 1:
                return "Endurance";
            case 2:
                return "Dexterity";
            case 3:
                return "Strength";
            case 4:
                return "Intelligence";
            case 5:
                return "Faith";
            default:
                return "";
        }
    }

    public int getStatValue(int statIndex) {
        switch (statIndex) {
            case 0:
                return player.getHP();
            case 1:
                return player.getEndurance();
            case 2:
                return player.getDexterity();
            case 3:
                return player.getStrength();
            case 4:
                return player.getIntelligence();
            case 5:
                return player.getFaith();
            default:
                return -1;
        }
    }
}
    

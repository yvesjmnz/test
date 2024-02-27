public class LevelUpScreen {
    private Player player;
    private int selectedStatIndex;

    public LevelUpScreen(Player player) {
        this.player = player;
    }

    public void display() {
        // Display the level up screen
        System.out.println("============ LEVEL UP SCREEN ============");
        System.out.println("Choose a stat to level up:");
        System.out.println("1. Health: " + player.getHealth() + " (" + calculateRuneCost(player.getLevel(), Stat.HEALTH) + " runes)");
        System.out.println("2. Endurance: " + player.getEndurance() + " (" + calculateRuneCost(player.getLevel(), Stat.ENDURANCE) + " runes)");
        System.out.println("3. Dexterity: " + player.getDexterity() + " (" + calculateRuneCost(player.getLevel(), Stat.DEXTERITY) + " runes)");
        System.out.println("4. Strength: " + player.getStrength() + " (" + calculateRuneCost(player.getLevel(), Stat.STRENGTH) + " runes)");
        System.out.println("5. Intelligence: " + player.getIntelligence() + " (" + calculateRuneCost(player.getLevel(), Stat.INTELLIGENCE) + " runes)");
        System.out.println("6. Faith: " + player.getFaith() + " (" + calculateRuneCost(player.getLevel(), Stat.FAITH) + " runes)");
        System.out.println("7. BACK");
        System.out.println("======================================");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

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
        if (player.getRunes() < calculateRuneCost(player.getLevel(), Stat.values()[selectedStatIndex])) {
            System.out.println("You don't have enough runes. Please go back and earn more runes.");
            display();
            return;
        }

        // Increase the selected stat value and the player's level
        Stat selectedStat = Stat.values()[selectedStatIndex];
        player.setStat(selectedStat, player.getStat(selectedStat) + 1);
        player.setLevel(player.getLevel() + 1);

        // Calculate the new rune cost
        int newRuneCost = calculateRuneCost(player.getLevel(), selectedStat);

        // Display a system message
        System.out.println("You have leveled up " + selectedStat.getName() + " to " + player.getStat(selectedStat) + "!");
        System.out.println("New rune cost: " + newRuneCost + " runes.");

        // Display the updated level up screen
        display();
    }

    private int calculateRuneCost(int level, Stat stat) {
        return (level * 100) / 2;
    }
}

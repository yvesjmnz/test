import java.util.Random;

public class Encounter {
    private Random random = new Random();

    public void handleEncounter(int position, boolean onSecondGrid) {
        if (!onSecondGrid) {
            switch (position) {
                case 1:
                    System.out.println("Encountering Boss: Godrick the Grafted");
                    break;
                case 4:
                    System.out.println("Entering through the door...");
                    break;
                default:
                    System.out.println("Encountering Enemy: " + getRandomEnemyName());
                    break;
            }
        } else {
            if (position == 1) {
                System.out.println("Boss Battle: RADAHN");
            } else if (position == 9) {
                System.out.println("Going back to the first grid...");
            } else {
                System.out.println("Encountering Enemy: " + getRandomEnemyName());
            }
        }
    }

    private String getRandomEnemyName() {
        String[] enemies = {"Skeleton", "Zombie", "Bandit", "Spider", "Goblin"};
        return enemies[random.nextInt(enemies.length)];
    }
}

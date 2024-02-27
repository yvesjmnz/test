//should be working

import java.util.Scanner;

public class CharacterCreationScreen {
    private static final String SCREEN_TITLE = "CHARACTER CREATION";
    private static final int MAX_NAME_LENGTH = 25;
    private static final int MAX_LEVEL = 50;

    public static void display() {
        System.out.println(SCREEN_TITLE);
        System.out.println(".OPTIONS.");
        System.out.println("[1] INPUT NAME");
        System.out.println("[2] SELECT JOB CLASS");
        System.out.println("[3] CONFIRM");
        System.out.println("[4] BACK");
    }

    public static Player createCharacter(Scanner scanner) {
        display(); // Display the character creation screen

        String name = null;
        String jobClass = null;

        int choice;
        while (true) {
            System.out.print("Select an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    name = inputName(scanner);
                    break;
                case 2:
                    jobClass = selectJobClass(scanner);
                    break;
                case 3:
                    if (name != null && jobClass != null) {
                        return new Player(name, jobClass);
                    } else {
                        System.out.println("Please input name and select job class before confirming.");
                    }
                    break;
                case 4:
                    return null; // Go back
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static String inputName(Scanner scanner) {
        System.out.print("Enter your name: ");
        scanner.nextLine(); // Consume newline character
        String name = scanner.nextLine();
        // Validate name length
        if (name.length() > MAX_NAME_LENGTH) {
            name = name.substring(0, MAX_NAME_LENGTH); // Trim name if too long
        }
        System.out.println("Name set to: " + name);
        return name;
    }

    private static String selectJobClass(Scanner scanner) {
        System.out.println("Select your job class:");
        System.out.println("[1] Vagabond");
        System.out.println("[2] Samurai");
        System.out.println("[3] Warrior");
        System.out.println("[4] Hero");
        System.out.println("[5] Astrologer");
        System.out.println("[6] Prophet");
        System.out.print("Enter the index of your job class: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return "VAGABOND";
            case 2:
                return "SAMURAI";
            case 3:
                return "WARRIOR";
            case 4:
                return "HERO";
            case 5:
                return "ASTROLOGER";
            case 6:
                return "PROPHET";
            default:
                System.out.println("Invalid job class index. Please try again.");
                return selectJobClass(scanner); // Recursively call to re-select job class
        }
    }
}

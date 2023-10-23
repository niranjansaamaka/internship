import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int choice;

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Enter your character's name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + "! You find yourself in a mystical land.");
        System.out.println("You can choose your path: do you want to be a knight, a mage, or a rogue?");
        System.out.println("1. Be a knight.");
        System.out.println("2. Be a mage.");
        System.out.println("3. Be a rogue.");

        choice = getUserChoice(scanner, 1, 3);

        if (choice == 1) {
            // Knight
            System.out.println("As a knight, you are known for your bravery and honor.");
            System.out.println("You are tasked with a quest to rescue a kidnapped princess.");
            System.out.println("Your journey begins.");
            System.out.println("You reach a crossroads. Do you go left or right?");
            System.out.println("1. Go left.");
            System.out.println("2. Go right.");

            choice = getUserChoice(scanner, 1, 2);

            if (choice == 1) {
                System.out.println("You go left and encounter a dragon blocking your path.");
                System.out.println("What do you do?");
                System.out.println("1. Challenge the dragon to combat.");
                System.out.println("2. Try to negotiate with the dragon.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You engage in a fierce battle and slay the dragon.");
                    // Continue the knight's story...
                } else {
                    System.out.println("You attempt to negotiate, but the dragon demands a treasure in exchange.");
                    // Continue the knight's story...
                }
            } else {
                System.out.println("You go right and find a magical forest.");
                System.out.println("You are confronted by enchanted creatures. What's your approach?");
                System.out.println("1. Engage in combat.");
                System.out.println("2. Seek their assistance.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You defeat the enchanted creatures and continue your quest.");
                    // Continue the knight's story...
                } else {
                    System.out.println("You seek their assistance and they provide you with a magical amulet.");
                    // Continue the knight's story...
                }
            }
        } else if (choice == 2) {
            // Mage
            System.out.println("As a mage, you possess powerful spells and knowledge of ancient secrets.");
            System.out.println("Your quest is to restore balance to a magical realm.");
            System.out.println("You arrive at a mystical portal. Do you enter or find an alternative path?");
            System.out.println("1. Enter the portal.");
            System.out.println("2. Find an alternative path.");

            choice = getUserChoice(scanner, 1, 2);

            if (choice == 1) {
                System.out.println("You enter the portal and are transported to a realm of floating islands.");
                System.out.println("You meet a group of ethereal beings. How do you interact with them?");
                System.out.println("1. Share your magical knowledge.");
                System.out.println("2. Request their guidance.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You share your magical knowledge and form a powerful alliance.");
                    // Continue the mage's story...
                } else {
                    System.out.println("You request their guidance and receive valuable insights.");
                    // Continue the mage's story...
                }
            } else {
                System.out.println("You find an alternative path through a dark forest.");
                System.out.println("You encounter a cursed object. What do you do?");
                System.out.println("1. Attempt to break the curse.");
                System.out.println("2. Avoid the object.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You attempt to break the curse and uncover hidden powers.");
                    // Continue the mage's story...
                } else {
                    System.out.println("You avoid the object and continue your journey.");
                    // Continue the mage's story...
                }
            }
        } else {
            // Rogue
            System.out.println("As a rogue, you excel in stealth and cunning.");
            System.out.println("You're on a mission to recover a stolen artifact.");
            System.out.println("You reach a city gate guarded by city guards. How do you proceed?");
            System.out.println("1. Bribe the guards.");
            System.out.println("2. Sneak past them.");
            choice = getUserChoice(scanner, 1, 2);

            if (choice == 1) {
                System.out.println("You attempt to bribe the guards, but they report you to the authorities.");
                System.out.println("You're now a wanted criminal. What's your next move?");
                System.out.println("1. Flee the city.");
                System.out.println("2. Infiltrate the city's prison to clear your name.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You flee the city and become a notorious outlaw.");
                    // Continue the rogue's story...
                } else {
                    System.out.println("You infiltrate the prison, clear your name, and continue your mission.");
                    // Continue the rogue's story...
                }
            } else {
                System.out.println("You use your stealth to sneak past the guards.");
                System.out.println("You arrive at a hidden thieves' guild. What's your next step?");
                System.out.println("1. Join the guild.");
                System.out.println("2. Convince the guild to aid your mission.");
                choice = getUserChoice(scanner, 1, 2);

                if (choice == 1) {
                    System.out.println("You join the guild, gaining valuable allies and resources.");
                    // Continue the rogue's story...
                } else {
                    System.out.println("You convince the guild to aid your mission.");
                    // Continue the rogue's story...
                }
            }
        }

        scanner.close();
    }

    public static int getUserChoice(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    System.out.println("Invalid choice. Enter a valid option (" + min + " or " + max + ").");
                } else {
                    return choice;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid option (" + min + " or " + max + ").");
            }
        }
    }
}

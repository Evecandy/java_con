package bananaShop;

import oop.Banana;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        List<Banana> bananas = initializeBananas();
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getMenuChoice();

            switch (choice) {
                case 1:
                    System.out.println("Adding Bananas...");
                    Banana banana = addBanana(scanner);
                    bananas.add(banana);
                    displayBananas(bananas);
                    break;
                case 2:
                    System.out.println("Viewing Bananas...");
                    displayBananas(bananas);
                    break;
                case 3:
                    System.out.println("Purchasing Bananas...");
                    purchaseBanana(bananas, scanner);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for visiting the Banana Shop!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static List<Banana> initializeBananas() {
        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana("Yellow", true, "Large", "Cooking banana", 100));
        bananas.add(new Banana("Green", false, "Medium", "Plantain", 150));
        bananas.add(new Banana("Yellow", true, "Small", "Sweet banana", 80));
        return bananas;
    }

    private static void displayMenu() {
        System.out.println("\nWelcome to the Banana Shop!");
        System.out.println("1. Add Bananas");
        System.out.println("2. View Bananas");
        System.out.println("3. Purchase Bananas");
        System.out.println("4. Exit");
        System.out.println("Please select an item from the above menu.");
    }

    private static int getMenuChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static Banana addBanana(Scanner scanner) {
        Banana banana = new Banana();
        scanner.nextLine(); // Clear buffer

        System.out.println("Enter Banana Type: ");
        banana.setType(scanner.nextLine());

        System.out.println("Enter Banana Color: ");
        banana.setColor(scanner.nextLine());

        System.out.println("Enter Banana Size: ");
        banana.setSize(scanner.nextLine());

        System.out.println("Is the Banana Ripe? (true/false): ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Please enter true or false:");
            scanner.next();
        }
        banana.setRipe(scanner.nextBoolean());

        System.out.println("Enter Banana Price: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid price:");
            scanner.next();
        }
        banana.setBananaPrice(scanner.nextInt());
        
        return banana;
    }

    public static void displayBananas(List<Banana> bananas) {
        if (bananas.isEmpty()) {
            System.out.println("No bananas in stock.");
            return;
        }

        System.out.println("\nCurrent Banana Inventory:");
        for (Banana banana : bananas) {
            System.out.println("-----------------------------");
            System.out.println("Type: " + banana.getType());
            System.out.println("Color: " + banana.getColor());
            System.out.println("Size: " + banana.getSize());
            System.out.println("Ripe: " + banana.getRipe());
            System.out.println("Price: $" + banana.getPrice());
        }
        System.out.println("-----------------------------");
    }

    public static void purchaseBanana(List<Banana> bananas, Scanner scanner) {
        if (bananas.isEmpty()) {
            System.out.println("Sorry, bananas are out of stock.");
            return;
        }

        System.out.println("\nAvailable Bananas for Purchase:");
        for (int i = 0; i < bananas.size(); i++) {
            Banana b = bananas.get(i);
            System.out.println("\nBanana #" + (i + 1));
            System.out.println("Type: " + b.getType());
            System.out.println("Color: " + b.getColor());
            System.out.println("Size: " + b.getSize());
            System.out.println("Price: $" + b.getPrice());
            System.out.println("-----------------------------");
        }

        System.out.println("\nEnter the number of the banana you wish to purchase (1-" + bananas.size() + "):");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number:");
            scanner.next();
        }
        int selection = scanner.nextInt();

        if (selection >= 1 && selection <= bananas.size()) {
            Banana selectedBanana = bananas.get(selection - 1);
            System.out.println("\nSelected Banana Details:");
            System.out.println("Type: " + selectedBanana.getType());
            System.out.println("Price: $" + selectedBanana.getPrice());

            System.out.println("\nConfirm purchase? (1: Yes / 2: No)");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter 1 for Yes or 2 for No:");
                scanner.next();
            }
            int confirm = scanner.nextInt();

            if (confirm == 1) {
                bananas.remove(selection - 1);
                System.out.println("Purchase successful!");
                System.out.println("Thank you for buying a " + selectedBanana.getType() + " banana.");
            } else {
                System.out.println("Purchase cancelled.");
            }
        } else {
            System.out.println("Invalid selection! Please choose a number between 1 and " + bananas.size());
        }
    }
}
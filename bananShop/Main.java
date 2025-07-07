package bananShop;

import oop.Banana;
import oop.Orange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static Scanner scanner;

    public static void main(String[] args) {

        /*
        1. Add Bananas
        2. View Banabas
        3. Purchasing Bananas
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banana Shop!");


        List<Banana> bananas = new ArrayList<>();
        bananas.add(new Banana("Yellow", true, "Large", "Cooking banana", 100));
        bananas.add(new Banana("Green", false, "Medium", "Plantain", 150));
        bananas.add(new Banana("Yellow", true, "Small", "Sweet banana", 80));

        System.out.println("1. Add Bananas");
        System.out.println("2. View Bananas");
        System.out.println("3. Purchase Bananas");

        System.out.println("Please select an item from the above menu.");

        int choice = scanner.nextInt();

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
            default:
                System.out.println("Invalid choice. Please try again.");
        }

    }

    public static Banana addBanana(Scanner scanner) {
        Banana banana = new Banana();

        System.out.println("Enter Banana Type: ");
        String type = scanner.next();
        banana.setType(type);
        System.out.println("Enter Banana Color: ");
        String color = scanner.next();
        banana.setColor(color);
        System.out.println("Enter Banana Size: ");
        String size = scanner.next();
        banana.setSize(size);
        System.out.println("Is the Banana Ripe? (true/false): ");
        boolean ripe = scanner.nextBoolean();
        banana.setRipe(ripe);
        System.out.println("Enter Banana Price: ");
        int price = scanner.nextInt();
        banana.setBananaPrice(price);
        return banana;
    }


    public static void displayBananas(List<Banana> bananas) {
        for (Banana banana : bananas) {
            System.out.println("Banana Type: " + banana.getType());
            System.out.println("Banana Color: " + banana.getColor());
            System.out.println("Banana Size: " + banana.getSize());
            System.out.println("Banana Ripe: " + banana.getRipe());
            System.out.println("Banana Price: " + banana.getPrice());
            System.out.println("-----------------------------");
        }
    }


    // Add this new method
    public static void purchaseBanana(List<Banana> bananas, Scanner scanner) {
        if (bananas.isEmpty()) {
            System.out.println("Sorry,, bananas are out of stock.");
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
        int selection = scanner.nextInt();

        if (selection >= 1 && selection <= bananas.size()) {
            Banana selectedBanana = bananas.get(selection - 1);
            System.out.println("\nSelected Banana Details:");
            System.out.println("Type: " + selectedBanana.getType());
            System.out.println("Price: $" + selectedBanana.getPrice());

            System.out.println("\nConfirm purchase? (1: Yes / 2: No)");
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

        public static String greeting (String name){
            return "Hello, " + name + "!";
        }


        public static void bananExamples (String name){
            //Primitive data types

            System.out.println("Number of banans created: " + Banana.bananasCreated);


            Banana kisiiBanana = new Banana("Yellow", true, "Large", "Kisii", 100);

            System.out.println("Number of banans created: " + Banana.bananasCreated);

            Banana kikuyuBanana = new Banana();
            kikuyuBanana.setType("Kikuyu");
            kikuyuBanana.bananasCreated = 23;

            System.out.println("Banana nutrients: " + kikuyuBanana.getNutrients());

            System.out.println("Number of banans created: " + Banana.bananasCreated);

            System.out.println("Kikuyu banana color - " + kikuyuBanana.getColor());


            System.out.println("Initial Price: - " + kisiiBanana.getPrice());

            kisiiBanana.setBananaPrice(120);

            System.out.println("Updated Price: - " + kisiiBanana.getPrice());

            kisiiBanana.setBananaPrice(24.8);
            System.out.println("Updated Price: - " + kisiiBanana.getPrice());

            kisiiBanana.setBananaPrice("One");
            System.out.println("Updated Price: - " + kisiiBanana.getPrice());


            Banana luhyaBana = new Banana("Luhya");

            System.out.println("Number of banans created: " + Banana.bananasCreated);


            Banana luoBanana = new Banana();

            System.out.println("Number of banans created: " + Banana.bananasCreated);

            Orange orange = new Orange();
            orange.setNutrients("Antioxidants");

            System.out.println(orange.getRipe());
            System.out.println(luhyaBana.getNutrients());
        }


        public static void loops () {

            int[] numbers = {23, 44, 55, 6, 2, 5, 6, 6, 3, 5, 3, 554, 3, 5, 9};


            //Continue
            //break

            //For loop
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Number: " + numbers[i]);
//        }

            //Enhanced for loop
            for (int num : numbers) {
                System.out.println("Number: " + num);
                if (num == 6) {
                    break;
                }
            }

            //finding the largest number in an array

//        int largest = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > largest) {
//                largest = numbers[i];
//            }
//        }
//
//        System.out.println("Largest Number: " + largest);


//        for (int i = 7; i < numbers.length; i++) {
//            if (numbers[i]%2 == 0) {
//                System.out.println(numbers[i]);
//            }
//        }


            //While loop
//        int j = 0;
//        while (j < numbers.length) {
//            System.out.println(numbers[j]);
//            j++;
//        }
//
//        //Do-while loop
//        int k = 0;
//
//        if (numbers.length > 0) {
//            do {
//                System.out.println(numbers[k]);
//                k++;
//            } while (k < numbers.length);
//        }
        }


        public static void arrays () {
            Integer[][] array = new Integer[7][4];

            //Initializing the array
            array[0][0] = 1;
            array[0][1] = 2;
            array[0][2] = 3;

            //printing array elements
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

            int[][] array2 = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            //Printing array2 elements
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }


        }


        public void ifStatement () {
            scanner = new Scanner(System.in);

            System.out.println("Enter your age: ");
            int userAge = scanner.nextInt();

            String message = (userAge < 18 && userAge > 0) ?
                    "You are a minor." :
                    (userAge > 18) ?
                            "You are an adult." :
                            "Invalid age!";

//        String message = userAge < 18 && userAge > 0  && userAge > 18 ? "You are a minor." : "You are an adult.";

            if (userAge > 18) {
                message = "You are an adult.";
            } else if (userAge < 18 && userAge > 0) {
                message = "You are a minor.";
            } else {
                message = "Invalid age!";
            }

            System.out.println(message);
        }


        public static Integer getAge () {
            return 30;
        }

        public void examples () {
            int age = 30; //-2,147,483,648 to 2,147,483,647
            double salary = 50000.50; //-1.7976931348623157E+308 to 1.7976931348623157E+308
            boolean isEmployed = true;
            char initial = 'A';
            float height = 5.9f; //-3.40282347E+38 to 3.40282347E+38
            long population = 780000000L; //-9223372036854775808 to 9223372036854775807
            short temperature = 25; //-32768 to 32767
            byte level = 127; //-128 to 127


//        byte value = 170;
//        age.


            //Reference data types
            String name = "John Doe";
            Integer ageObject = null;
            Double salaryObject = Double.valueOf(salary);
            Boolean isEmployedObject = Boolean.valueOf(isEmployed);
            Character initialObject = Character.valueOf(initial);
            Float heightObject = Float.valueOf(height);
            Long populationObject = Long.valueOf(population);
            Short temperatureObject = Short.valueOf(temperature);


            if (ageObject != null) {
                System.out.println("Age Object is not null: " + ageObject);
//           ageObject.
            }


            //Operators
            //Arithmetic Operators + - * / %
            int sum = age + 5; //Addition

            //Assignment Operators =, +=, -=, *=, /=, %=

            int x = 9;
            int y = 2;

//        int b = x % y;

            System.out.println(x %= y);


            //Relational Operators == != > < < >= <=
            //Logical Operators
            //Bitwise Operators
            //Unary Operators


            System.out.println("Enter your name: ");

            String userName = scanner.nextLine();

            System.out.println("Enter your age: ");
            int userAge = scanner.nextInt();

            System.out.println("Enter your salary: ");
            float salaryFloat = scanner.nextFloat();

            scanner.close();

//        String greetingMessage = greeting(userName);


            System.out.println("Hello " + userName + "! You are " + userAge + " years old.");

            System.out.printf("Your salary is: %.2f\n", salaryFloat);


            if (userAge < 18) { //expression
                System.out.println("You are a minor."); //statement
            } else {
                System.out.println("You are an adult.");
            }

            String message = (userAge < 18) ? "You are a minor." : "You are an adult.";


            System.out.println(message);

            //If then
            //if then else
            //nested if

//
//        System.out.printf("Hello, %s!  Welcome to the Java program.\n", userName);
//        System.out.println("Your age is: " + age);

        }


    }
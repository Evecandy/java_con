package bananaShop;


import oop.Banana;
import java.util.ArrayList;
import java.util.List;

public class listExample {
    public static void main(String[] args) {
        // Create a list to store bananas
        List<Banana> bananaList = new ArrayList<>();

        // Adding bananas to the list
        bananaList.add(new Banana("Yellow", true, "Large", "Cavendish", 100));
        bananaList.add(new Banana("Green", false, "Medium", "Plantain", 150));
        bananaList.add(new Banana("Yellow", true, "Small", "Lady Finger", 80));

        // Demonstrating List operations
        System.out.println("=== List Operations Demo ===");

        // 1. Getting list size
        System.out.println("\n1. List Size:");
        System.out.println("Number of bananas: " + bananaList.size());

        // 2. Accessing elements
        System.out.println("\n2. Accessing First Banana:");
        Banana firstBanana = bananaList.getFirst();
        System.out.println("First banana type: " + firstBanana.getType());

        // 3. Iterating through the list
        System.out.println("\n3. All Bananas in List:");
        for (Banana banana : bananaList) {
            System.out.println("Type: " + banana.getType() +
                    ", Color: " + banana.getColor() +
                    ", Price: $" + banana.getPrice());
        }

        // 4. Removing an element
        System.out.println("\n4. Removing Second Banana:");
        bananaList.remove(1);
        System.out.println("List size after removal: " + bananaList.size());

        // 5. Checking if it contains an element
        System.out.println("\n5. Checking List Contents:");
        boolean hasExpensiveBanana = false;
        for (Banana banana : bananaList) {
            if (banana.getPrice() > 120) {
                hasExpensiveBanana = true;
                break;
            }
        }
        System.out.println("Has expensive banana (>$120)? " + hasExpensiveBanana);

        // 6. Clearing the list
        System.out.println("\n6. Clearing the List:");
        bananaList.clear();
        System.out.println("Is list empty? " + bananaList.isEmpty());

        // 7. Adding multiple bananas at once
        System.out.println("\n7. Adding Multiple Bananas:");
        List<Banana> newBananas = new ArrayList<>();
        newBananas.add(new Banana("Red", true, "Medium", "Red Banana", 200));
        newBananas.add(new Banana("Brown", true, "Large", "Twin Banana", 180));
        bananaList.addAll(newBananas);
        System.out.println("List size after adding multiple: " + bananaList.size());

        // 8. Finding index of an element
        System.out.println("\n8. Finding Banana Position:");
        for (int i = 0; i < bananaList.size(); i++) {
            Banana banana = bananaList.get(i);
            if (banana.getType().equals("Red Banana")) {
                System.out.println("Red Banana is at position: " + i);
            }
        }
    }
}

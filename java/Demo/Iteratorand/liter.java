package Demo.Iteratorand;

import java.util.ArrayList;
import java.util.ListIterator;

public class liter{
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        
        // Creating a ListIterator for the ArrayList
        ListIterator<String> listIterator = fruits.listIterator();
        
        // Iterating forward and adding an element
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                // Adding an element after "Banana"
                listIterator.add("Orange");
                break;
            }
        }
        
        // Iterating backward and removing an element
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            if (fruit.equals("Cherry")) {
                // Removing "Cherry" from the list
                listIterator.remove();
                break;
            }
        }
        
        // Iterating forward and modifying an element
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Orange")) {
                // Modifying "Orange" to "Peach"
                listIterator.set("Peach");
                break;
            }
        }
        
        // Displaying the modified list
        System.out.println("Modified List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}


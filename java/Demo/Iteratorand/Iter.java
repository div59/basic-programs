package Demo.Iteratorand;

import java.util.ArrayList;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Creating an iterator for the ArrayList
        Iterator<Integer> iterator = numbers.iterator();

        // Using hasNext(), next(), and remove() methods of the Iterator
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            System.out.println("Current number: " + currentNumber);
            
            // Removing the element 3 from the list using remove()
            if (currentNumber == 3) {
                iterator.remove();
                System.out.println("Removed the number 3.");
            }
        }

        // Displaying the modified list after removal
        System.out.println("List after removal:");
        for (int number : numbers) {
            System.out.println(" numbers" + number);
        }
        numbers.forEach((k)->System.out.println(k));
        ;
    }
}

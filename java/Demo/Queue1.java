package Demo;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // Create a Queue
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        //if u cant add then throws an exception but offer returns false
        System.out.println("Adding elements to the queue...");
         queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println("Queue: " + queue);

        // Using offer() method
        System.out.println("\nUsing offer() method...");
         queue.offer(40);
         
         queue.offer(44);
         queue.offer(88);
        System.out.println("Queue: " + queue);

        // Removing elements from the queue 
        //but throws an exception  if cant remive then but poll returns null
        System.out.println("\nRemoving elements from the queue...");
        System.out.println("remove(): " + queue.remove());
        System.out.println("Queue: " + queue);
        /*
        E remove(): Removes and returns the element at the front of the queue. Throws an exception if the queue is empty.

E poll(): Removes and returns the element at the front of the queue. Returns null if the queue is empty.

E element(): Returns the element at the front of the queue without removing it. Throws an exception if the queue is empty.

E peek(): Returns the element at the front of the queue without removing it. Returns null if the queue is empty.
*/
        // Using poll() method
        System.out.println("\nUsing poll() method...");
        System.out.println("poll(): " + queue.poll());
        System.out.println("Queue: " + queue);

        // Using element() method
        System.out.println("\nUsing element() method...");
        System.out.println("element(): " + queue.element());
        System.out.println("Queue: " + queue);

        // Using peek() method
        System.out.println("\nUsing peek() method...");
        System.out.println("peek(): " + queue.peek());
        System.out.println("Queue: " + queue);
    }
}

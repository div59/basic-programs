package Demo;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        System.out.println("Pushing elements onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        // Using pop() method
        System.out.println("\nUsing pop() method...");
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack: " + stack);

        // Using peek() method
        System.out.println("\nUsing peek() method...");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack: " + stack);

        // Using empty() method
        System.out.println("\nUsing empty() method...");
        System.out.println("Is stack empty? " + stack.empty());

        // Using search() method
        System.out.println("\nUsing search() method...");
        System.out.println("Position of element 20: " + stack.search(20));
        System.out.println("Position of element 50: " + stack.search(50));
    }
}

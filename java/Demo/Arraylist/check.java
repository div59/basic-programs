package Demo.Arraylist;

import java.util.LinkedList;

public class check {
    public static void main(String[] args) {
        // Task a: Adding elements 'x', 'y', 'z' to list1 and display contents
        LinkedList<Character> list1 = new LinkedList<>();
        list1.add('x');
        list1.add('y');
        list1.add('z');
        System.out.println("List1 after adding elements: " + list1);

        // Task b: Adding element 'b' at the end and element 'w' at the start of list1
        list1.addLast('b');
        list1.addFirst('w');
        System.out.println("List1 after adding 'b' at the end and 'w' at the start: " + list1);

        // Task c: Adding element 'a' to list1 at index 4
        list1.add(4, 'a');
        System.out.println("List1 after adding 'a' at index 4: " + list1);

        // Task d: Creating a new list list2 with sublist of list1 from index 1 to 3 and display list2
        LinkedList<Character> list2 = new LinkedList<>(list1.subList(1, 4));
        System.out.println("List2 containing sublist of list1 from index 1 to 3: " + list2);

        // Task e: Removing elements of list1 that are in list2 and display list1 after removal
        list1.removeAll(list2);
        System.out.println("List1 after removing elements present in list2: " + list1);
    }
}

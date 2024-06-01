package Demo.linkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Single {

	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<>();
		l.add(9);
		l.add(8);
		l.add(10);
		l.add(2);
		System.out.println(l);
		l.set(3, 5);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		
		
		l.addLast(89);
		l.addFirst(90);
		System.out.println("added "+l);
		
		
		System.out.println(" getFirstl "+l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		System.out.println("removeFirst " +l);
		l.removeLast();
		System.out.println("removeLast "+l);
		
		//reverse
		Collections.reverse(l);
		System.out.println("reversing "+l);
		
		
		//reverse
		LinkedList<Integer> l2=new LinkedList<>();
		ListIterator<Integer>  i=l.listIterator(l.size());
		while(i.hasPrevious()) {
			l2.add(i.previous());
		}
		System.out.println(l2);
		
		Collections.sort(l);
		System.out.println("sorting  "+l);
		}

	
	
	
	
}

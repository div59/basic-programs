package Demo.linkedlist;

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
		
		//reverse
		LinkedList<Integer> l2=new LinkedList<>();
		ListIterator<Integer>  i=l.listIterator(l.size());
		while(i.hasPrevious()) {
			l2.add(i.previous());
		}
		System.out.println(l2);
		}

	
}

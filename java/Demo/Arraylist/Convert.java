package Demo.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Convert {
	public static void main(String [] args) {
		ArrayList<Integer> l =new ArrayList<>();
		l.add(4);
		l.add(6);
		l.add(45);
		//now we r gonn convert arraylist to an array

		Integer []arr=l.toArray(new Integer[l.size()]);
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		
		List<Integer> list2 =new Stack<>()	;
		list2.add(8);
		list2.add(7);
		list2.add(90);
		list2.add(70);
		System.out.println(list2);
		list2.remove(0);
		System.out.println(list2);
	}

}

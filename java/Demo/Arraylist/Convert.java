package Demo.Arraylist;

import java.util.ArrayList;

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
	}

}

package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclass1 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(8);
		l.add(3);
		l.add(2);
		l.add(888);
		l.add(56);
		l.add(123);
		l.add(2);
		l.add(2);
		System.out.println(Collections.min(l));
		System.out.println(Collections.max(l));
		System.out.println(Collections.frequency(l, 2));
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		
		//
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println(l);
	}

}

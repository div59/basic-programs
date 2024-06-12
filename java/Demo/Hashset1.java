package Demo;

import java.lang.System.Logger;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset1 {

	public static void main(String[] args) {
		Set<Integer> set =new HashSet<>();  // O(1)
		//set it doest conatin dublicate values and when it prints it wont maintain the order
		
//		
//		Set<Integer> set =new LinkedHashSet<>();
		//it maintains the order as it implements both set and linkedlist so
		
		
		
//		Set<Integer> set =new TreeSet<>();//O(log(n))
		//it implements both set and binarytree so the output will has sorted from
		
		set.add(23);
		set.add(98);
		set.add(78);
		set.add(112);
		set.add(55);
		set.add(55);//it wont print this
		System.out.println(set);

		
		set.remove(112);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains(55));
		System.out.println(set.isEmpty());
		set.clear();
	}

}

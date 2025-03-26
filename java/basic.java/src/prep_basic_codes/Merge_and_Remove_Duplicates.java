package prep_basic_codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Merge_and_Remove_Duplicates {

	public static void main(String[] args) {
		Integer a[]= {1,2,3,4};
		Integer b[]= {3,4,5,6,7,8};
		
		ArrayList<Integer> c=new ArrayList<>(Arrays.asList(a));
		c.addAll(Arrays.asList(b));
		
		
		//another method to merger 2 arrays are
		
//		 List<Integer> a=Arrays.asList(1,2,3,4);
//		 List<Integer> b=Arrays.asList(3,4,5,6,7);
//		 List<Integer> c=new ArrayList<>();
//		 c.addAll(a);
//		 a.addAll(b);
		 
		HashSet<Integer> s=new HashSet<>(c);
		System.out.println(s);
		  

	}

}

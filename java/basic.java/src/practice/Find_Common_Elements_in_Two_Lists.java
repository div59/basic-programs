package practice;

import java.util.Arrays;
import java.util.List;

public class Find_Common_Elements_in_Two_Lists {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3,4);
		List<Integer> l2=Arrays.asList(3,4,5,6);
		for(Integer i:l1) {
			if(l2.contains(i)) {
				System.out.print(i+" ");
			}
		}
		

	}

}

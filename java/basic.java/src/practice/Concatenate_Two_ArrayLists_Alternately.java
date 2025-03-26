package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concatenate_Two_ArrayLists_Alternately {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("a","b","c");
		List<Integer> l2=Arrays.asList(1,2,3,4,6);
		int m=l1.size();
		int n=l2.size();
		int i=0,j=0;
		while(i<m && j<n) {
			System.out.println(l1.get(i++));
			System.out.println(l2.get(j++));
		
	}
		while(i<m) {
			System.out.println(l1.get(i++));
		}
		while(j<n) {
			System.out.println(l2.get(j++));
		}
		
	}

}

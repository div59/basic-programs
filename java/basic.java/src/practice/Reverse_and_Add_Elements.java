package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_and_Add_Elements {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3);
		List<Integer> l2=new ArrayList<>(l1);
		Collections.reverse(l2);
		List<Integer> ans=new ArrayList<>(l1);
		ans.addAll(l2);
		System.out.println(ans);

	}

}

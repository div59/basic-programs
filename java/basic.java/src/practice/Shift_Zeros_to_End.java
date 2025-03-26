package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift_Zeros_to_End {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(0, 1, 0, 3, 0, 12);
		List<Integer> l2=new ArrayList<>();
		List<Integer> l3=new ArrayList<>();
		for(Integer i:l1) {
			if(i==0) {
				l2.add(i);
			}
			else {
				l3.add(i);
			}
		}
List<Integer> res=new ArrayList<>(l3);
res.addAll(l2);
System.out.println(res);
	}

}

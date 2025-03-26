package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Indices_of_a_Value {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(3, 5, 3, 8, 3, 9);
		int n=3;
		List<Integer> l2=new ArrayList<>();
		for(int i=0;i<l1.size();i++) {
			if(l1.get(i)==n) {
//				System.out.print(i+" ");
				l2.add(i);
			}
		}
		System.out.println(l2);
		

}
}

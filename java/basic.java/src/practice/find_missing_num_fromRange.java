package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_missing_num_fromRange {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,4,6,7);
		List<Integer> l2=new ArrayList<>();
		int n=1;
		int m=7;
		for(int i=n;i<=m;i++) {
			if(!l1.contains(i)) {
//				System.out.print(i+" ");
				l2.add(i);
			}
		}
		System.out.print(l2);
		

	}

}

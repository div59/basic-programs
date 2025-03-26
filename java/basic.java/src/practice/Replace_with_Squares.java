package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replace_with_Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(2,3,4,5,6);
		List<Integer> b=new ArrayList<>();
		for(Integer i:a) {
			b.add((int) Math.pow(i, 2));
		}
		System.out.println(b);
		
	}

}

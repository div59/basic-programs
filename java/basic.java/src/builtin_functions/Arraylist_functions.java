package builtin_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(5);
		arrayList.add(2);
		arrayList.add(0);
		arrayList.add(5);
		
		arrayList.replaceAll(n->(n==5)?8:n);// n here means each integer value iterates
		System.out.println(arrayList);
		arrayList.remove(1);//index
		
		System.out.println(arrayList);
		
		
		arrayList.clear();
		System.out.println(arrayList);
		
		
		
		arrayList.addAll(Arrays.asList(1,2,3,4));
		System.out.println(arrayList);
		
		
		ArrayList<Integer> b=new ArrayList<>();
		b.addAll(arrayList);
		arrayList.addAll(b);
		System.out.println(arrayList);
		
		
		System.err.println(arrayList.indexOf(3));
		
		if(arrayList.contains(5)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}

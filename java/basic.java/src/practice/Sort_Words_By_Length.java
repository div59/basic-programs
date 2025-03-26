package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Words_By_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is powerful and flexible";
		String a[]=s.split(" ");
		Integer b[]=new Integer[a.length];
		int k=0;
		for(String i:a) {
			b[k++]=i.length();
		}
		System.out.println(Arrays.toString(b));
		List<Integer> j=new ArrayList<>(Arrays.asList(b));
		Collections.sort(j);
		System.out.println(j);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[j.get(i)]);
		}
				}

}

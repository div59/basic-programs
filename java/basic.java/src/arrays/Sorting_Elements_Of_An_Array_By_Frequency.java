package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sorting_Elements_Of_An_Array_By_Frequency {

	public static void main(String[] args) {
		/*
		 * 10 20 10 10 20 30 45 30 30 4 5
			10 :: 3
			20 :: 2
			30 :: 3
			45 :: 1
			4 :: 1
			5 :: 1
		 */
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String []s=s1.split(" ");
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++) {
			a[i]=Integer.valueOf(s[i]);
		}
		LinkedHashMap<Integer,Integer> l =new LinkedHashMap<>();
		LinkedHashMap<Integer,Integer> k =new LinkedHashMap<>();
		for(int i:a) {
			if(!l.containsKey(i)) {
				l.put(i, 1);
			}
			else {
				l.put(i, l.get(i)+1);
			}
			
		}
		System.out.println(l);
		int f=0;
		for(int i:l.keySet()) {
			if(l.get(i)!=1) {
				System.out.println(i );
			}
		}

}
}

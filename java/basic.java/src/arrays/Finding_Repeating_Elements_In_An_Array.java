package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Finding_Repeating_Elements_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.nextLine();
		String []s=s1.split(" ");
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++) {
			a[i]=Integer.valueOf(s[i]);
		}
		LinkedHashMap<Integer,Integer> l =new LinkedHashMap<>();
		for(int i:a) {
			if(!l.containsKey(i)) {
				l.put(i, 1);
			}
			else {
				l.put(i, l.get(i)+1);
			}
			
		}
		System.out.println(l);
		for(int i:l.keySet()) {
			if(l.get(i)>1) {
				System.out.println(i );
			}
		}
		
}
}

package Strings;

import java.util.Scanner;



public class Toggle_each_character_in_a_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		
		char a[]=s.toCharArray();
		char b[]=new char[a.length];
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i])) {
				b[i]=Character.toLowerCase(a[i]);
			}
			else {
				b[i]=Character.toUpperCase(a[i]);
			}
		
		}
		System.out.println(b);
		}

}

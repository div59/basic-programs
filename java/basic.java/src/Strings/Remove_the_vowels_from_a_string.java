package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_the_vowels_from_a_string {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		StringBuilder b=new StringBuilder();
		for(int i=0;i<c.length;i++) {
			char g=Character.toLowerCase(c[i]);
			
			if (g!='a'&& g!='e' && g!='i' && g!='o' && g!='u') {
				b.append(g);
				
			}
		}
		
		
		System.out.println(b.toString());
		

	}

}

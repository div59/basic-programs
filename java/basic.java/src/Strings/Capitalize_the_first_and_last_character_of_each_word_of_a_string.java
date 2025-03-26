package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Capitalize_the_first_and_last_character_of_each_word_of_a_string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s =scanner.nextLine().toLowerCase();
		String [] a=s.split(" ");
		StringBuilder b=new StringBuilder();
//		System.out.println(Arrays.toString(a));
		for(String s1:a) {
			int l=s1.length();
			if(l==1) {
					b.append(Character.toUpperCase(s1.charAt(0))).append(" ");
				}
			else {
				String n=Character.toUpperCase(s1.charAt(0))+s1.substring(1,l-1)+Character.toUpperCase(s1.charAt(l-1));
				b.append(n).append(" ");
			}
			
			

	}
		System.out.println(b);
		

}
}

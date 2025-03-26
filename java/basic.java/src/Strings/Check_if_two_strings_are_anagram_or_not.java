package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Check_if_two_strings_are_anagram_or_not {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s1=scanner.next();
		String s2=scanner.next();
		char [] a=s1.toCharArray();
		char [] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		

	}

}

package Strings;

import java.util.Scanner;

public class Replace_a_substring_in_a_string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String s1=scanner.next();
		String s2=scanner.next();
		String r=string.replace(s1, s2);
		System.out.println(r);

	}

}

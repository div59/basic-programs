package Strings;

import java.util.Scanner;

public class Check_if_the_given_string_is_palindrome_or_not {
	public static void  main(String [] args) { 
	Scanner scanner=new Scanner(System.in);
	String string =scanner.nextLine();
	StringBuilder  b=new StringBuilder(string);
	String gString = b.reverse().toString();
	
	if(string.equals(gString)) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
	
	
	}

}

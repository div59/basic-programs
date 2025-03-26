package Strings;

import java.util.Scanner;

public class Print_the_given_string_in_reverse_order {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string =scanner.nextLine();
		StringBuilder  b=new StringBuilder(string);
		String gString = b.reverse().toString();
		System.out.println(gString);

	}

}

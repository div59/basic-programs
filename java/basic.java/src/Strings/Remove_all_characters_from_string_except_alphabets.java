package Strings;

import java.util.Scanner;

public class Remove_all_characters_from_string_except_alphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		char [] a=s.toCharArray();
		for(char c:a) {
			if(Character.isLetter(c)) {
				System.out.print(c);
			}
			
		}
	}

}

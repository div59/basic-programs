package Strings;

import java.util.Arrays;
import java.util.Scanner;

import prep_basic_codes.Strong_Number;

public class Remove_spaces_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		char []a=s.toCharArray();
		for(char c:a) {
			if(!Character.isWhitespace(c)) {
				System.out.print(c);
			}
			
		}
		
	}

}

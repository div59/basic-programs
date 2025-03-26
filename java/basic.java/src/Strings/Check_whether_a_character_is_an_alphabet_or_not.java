package Strings;

import java.util.Scanner;

public class Check_whether_a_character_is_an_alphabet_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char c=Character.toLowerCase(scanner.next().charAt(0));
		//if (Character.isAlphabetic(c)) {
		if (Character.isLetter(c)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}

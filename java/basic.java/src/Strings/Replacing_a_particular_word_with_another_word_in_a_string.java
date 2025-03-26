package Strings;

import java.util.Scanner;

public class Replacing_a_particular_word_with_another_word_in_a_string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String s1=scanner.next();
		String[] ans=string.split(" ");
		for(String a:ans) {
			if (!a.equals(s1)) {
				System.out.print(a+" ");
			}
		}
		
	}

}

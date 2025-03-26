package Strings;

import java.util.Scanner;

public class Count_the_number_of_vowels {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(char c:s.toCharArray()) {
			c=Character.toLowerCase(c);
			if(c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u' ) {
				count+=1;
			}
				
		}
		System.out.println(count);
		
	}

}

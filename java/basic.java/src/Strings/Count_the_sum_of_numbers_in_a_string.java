package Strings;

import java.util.Scanner;

public class Count_the_sum_of_numbers_in_a_string {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		char a[]=s.toCharArray();
		int sum=0;
		for(char i:a) {
			if(Character.isDigit(i)) {
				int j=Integer.valueOf(String.valueOf(i));
				
				sum+=j;
			}
		}
		System.out.print(sum);
	}

}

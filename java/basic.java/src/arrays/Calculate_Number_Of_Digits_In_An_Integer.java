package arrays;

import java.util.Scanner;

public class Calculate_Number_Of_Digits_In_An_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int count=0;
		char []c=String.valueOf(n).toCharArray();
		for(char g:c) {
			count++;
		}
		System.out.println(count);

	}

}

package prep_basic_codes;

import java.util.Scanner;



public class Palindrome_Number {

	public static void main(String[] args) {
		// 121
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int summ=0,r;
		int temp=n;
		while(n!=0) {
			r=n%10;
			summ=summ*10+r;
			n=n/10;
			
		}
		
		if(summ==temp) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}

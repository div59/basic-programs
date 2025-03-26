package prep_basic_codes;

import java.util.Scanner;

public class Sum_of_Digits_of_a_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		int r;
		//1234=10
		while(n!=0) {
			r=n%10;
			k+=r;
			n=n/10;
		}
		System.out.println(k);

	}

}

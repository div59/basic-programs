package prep_basic_codes;

import java.util.Scanner;

public class Factorial_of_a_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j=1;
		for(int i=1;i<=n;i++) {
			j*=i;
			
		}
		System.out.println(j);
		
	}

}

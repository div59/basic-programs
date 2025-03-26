package prep_basic_codes;

import java.util.Scanner;

public class Perfect_Number {
	

	public static void main(String[] args) {
		/*
		 * Example
Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors)
		 */
		Scanner scanner =new Scanner(System.in);
		int n=scanner.nextInt();
		int h=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				h+=i;
			}
		}
		if(n==h) {
			System.out.println(h+"  yes");
		}
		else {
			System.out.println(h+ " no");
		}
	}

}

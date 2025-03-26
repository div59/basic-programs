package prep_basic_codes;

import java.util.Scanner;

public class reverse_a_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		int r;
		
		while(n!=0) {
			r=n%10;
			k=k*10+r;
			n=n/10;
		}
		System.out.println(k);

	}

}

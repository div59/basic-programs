package prep_basic_codes;

import java.util.Scanner;

public class Factor_of_a_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n;i++) {
			if (n%i==0)
			System.out.print(i+" ");
		}

	}

}

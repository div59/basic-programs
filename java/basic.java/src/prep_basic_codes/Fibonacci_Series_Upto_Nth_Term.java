package prep_basic_codes;

import java.util.Scanner;

public class Fibonacci_Series_Upto_Nth_Term {

	public static void main(String[] args) {
		int f1=0,f2=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(f1+" "+f2);
		for(int i=2;i<n;i++) {
			int f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
	}

}

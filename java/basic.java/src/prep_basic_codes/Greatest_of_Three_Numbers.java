package prep_basic_codes;

import java.util.Scanner;

public class Greatest_of_Three_Numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int p=s.nextInt();
		int g=n>m?n:m;
		int h=g>p?g:p;
		System.out.println(h);

	}

}

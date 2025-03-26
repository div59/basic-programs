package prep_basic_codes;

import java.util.Scanner;

public class Harshad_Number {

	public static void main(String[] args) {
		// which is completely divisible by sum of  its digits.
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1=String.valueOf(n);
		char a[]=s1.toCharArray();
		int g=0;
		for(int i=0;i<a.length;i++) {
//			char f=a[i];
			int f=a[i]-'0';
//			int h=Character.getNumericValue(f);
			g+=f;
			
		}
		if (n%g==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}

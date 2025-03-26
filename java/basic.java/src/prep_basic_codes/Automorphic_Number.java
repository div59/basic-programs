package prep_basic_codes;

import java.util.Arrays;
import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String n2=String.valueOf(n);
		

//			76=(76)2 = 5776
//		6775
//		67
//		76

		
		System.out.println(n);
		int ans1=(int)Math.pow(n, 2);
		String s1=String.valueOf(ans1);
		StringBuilder sb=new StringBuilder(s1).reverse();
		String smallString=sb.substring(0,n2.length());
		StringBuilder ans=new StringBuilder(smallString).reverse();
		String res=ans.toString();
		int r=Integer.valueOf(res);
		
		System.out.println(sb);
		System.out.println(r);
		
		
		

	}

}

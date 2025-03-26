package prep_basic_codes;


import java.util.Scanner;

public class Greatest_of_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
//		if (n>m) {
//			System.out.println(n);
//		}
//		else if(m>n) {
//			System.out.println(m);
//		}
//		else {
//			System.out.println("same");
//		}
		 int d=n>m?n:m;
		System.out.println(d);
		

	}

}

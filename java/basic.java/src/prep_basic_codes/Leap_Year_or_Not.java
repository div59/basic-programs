package prep_basic_codes;


import java.util.Scanner;

public class Leap_Year_or_Not {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%400==0 || (n%100!=0 && n%4==0 )) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}

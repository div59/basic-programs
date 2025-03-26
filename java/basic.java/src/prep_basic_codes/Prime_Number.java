package prep_basic_codes;


import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in) ;
		int n=s.nextInt();
		int h=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				h=1;
			}
		}
		if (h==1) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
	
	}
		
		

}

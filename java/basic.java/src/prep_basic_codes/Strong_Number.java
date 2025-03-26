package prep_basic_codes;

import java.util.Scanner;

public class Strong_Number {
	
	static int fact(int k) {
		int j=1;
		for(int i=1;i<=k;i++) {
			j*=i;
		}
		
		return j;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int g=n;
		/*
		 * A Number that can be represented as the sum of the factorial of it's individual digits is known as a Strong Number.
Let's try and understand the concept better using an example

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
		 */
		int h=0,r;
		while(n!=0) {
			r=n%10;
			h+=fact(r);
			n=n/10;
			
		}
		if (h==g) {
			System.out.println(h+" yes");
		}
		else {
			System.out.println(h+" no");
		}
		
		
		
	}

}

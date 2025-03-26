package prep_basic_codes;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * A Number that is smaller than the sum of all it's factors except the number itself is known as an Abundant number.
Let's try and understand the concept better using an example

Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.
 */



public class Abundant_Number {

	public static void main(String[] args) {

		Scanner  s=new Scanner(System.in);
		int n=s.nextInt();
		String s1=String.valueOf(n);
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				l.add(i);
			}
		}
		int sum=0;
		for(int g:l) {
			sum+=g;
		}
		System.out.println(l);
		System.out.println(sum);
		if(sum>n) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}

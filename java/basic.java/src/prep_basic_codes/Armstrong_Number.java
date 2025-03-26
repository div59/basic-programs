package prep_basic_codes;

import java.util.Scanner;



public class Armstrong_Number {

	public static void main(String[] args) {
		/*Example
		Input : 371
		Output : It's an Armstrong Number.
		Explanation: 371 = 3^3 + 7^3 + 1^3
		Therefore it's an Armstrong number.*/
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l,d=0;
		String st=String.valueOf(n);
		l=st.length();
		char s1[]=st.toCharArray();
		for(char i:s1) {
			int j=Character.getNumericValue(i);
			d=(int)(d+(Math.pow(j, l)));
			}
		if(d==n) {
			System.out.println("yes");
		}
		else {
		System.out.println("no");
		}
	}

}

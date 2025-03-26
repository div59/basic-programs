package prep_basic_codes;

import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int summ=0;
		for(int i=1;i<=n;i++)
		{
			summ+=i;
		}
		System.out.println("sum: " + summ);
	}

}

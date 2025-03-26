package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Counting_The_Number_Of_Even_And_Odd_Elements_In_An_Array {

	public static void main(String[] args) {
		ArrayList<Integer>a =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a.add(sc.nextInt());
		}
		int e=0,o=0;
		for(int i=0;i<5;i++) {
			if (a.get(i)%2==0) {
				e+=1;
			}
			else {
				o+=1;
			}
		}
		System.out.println("even :" + e + " and  odd :" + o);
	}

}

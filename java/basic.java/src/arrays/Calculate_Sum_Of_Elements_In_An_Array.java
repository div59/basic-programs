package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculate_Sum_Of_Elements_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<n;i++) {
				list.add(scanner.nextInt());
			}
			int s=0;
			for(int h:list) {
				s+=h;
			}
			System.out.println(s);
		

	}

}

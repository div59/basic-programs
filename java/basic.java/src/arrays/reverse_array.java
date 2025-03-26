package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverse_array{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a.add(sc.nextInt());
		}
		Collections.reverse(a);
		System.out.println(a);
	}

}

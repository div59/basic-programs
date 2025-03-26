package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Find_Smallest_Element_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<n;i++) {
				list.add(scanner.nextInt());
			}
			Collections.sort(list);
			System.out.println(list.get(0));
	}
}


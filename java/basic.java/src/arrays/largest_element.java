package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	int n=scanner.nextInt();
//		int a[]=new int[n];
//		for(int i=0;i<n;i++) {
//			a[i]=scanner.nextInt();
//			
//		}
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);
		
		System.out.println(Collections.max(list));
		System.out.println(list.get(n-1));
	
	}

}

package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_First_Half_In_Ascending_Order_And_Second_Half_In_Descending {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<Integer>a =new ArrayList<>();
		ArrayList<Integer>b =new ArrayList<>();
		ArrayList<Integer>c =new ArrayList<>();
		ArrayList<Integer>d =new ArrayList<>();
		for(int i=0;i<n;i++) {
			a.add(scanner.nextInt());
			
		}
		Collections.sort(a);
		int h=n/2;
		for(int i=0;i<h;i++) {
			b.add(a.get(i));
		}
		
		Collections.sort(b);
		
		for(int i=h;i<n;i++) {
			c.add(a.get(i));
		}
		Collections.sort(c,Collections.reverseOrder());
		for(int i=0;i<b.size();i++) {
			d.add(b.get(i));
		}
		for(int i=0;i<c.size();i++) {
			d.add(c.get(i));
		}
		System.out.println(d);
	}

}

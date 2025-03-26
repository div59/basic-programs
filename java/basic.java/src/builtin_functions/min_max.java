package builtin_functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Integer [] a=new Integer[5];
		for(int i=0;i<5;i++) {
			a[i]=(scanner.nextInt());
		}
		ArrayList<Integer> b=new ArrayList<>(Arrays.asList(a));
		
		
		int c=Collections.min(b);
		System.out.println("min "+c);
		System.out.println("max "+Collections.max(b));
		System.out.println(Collections.frequency(b, b));
	}

}

package Demo.basics;

import java.util.Arrays;// see this
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		int []arr=new int[5];
		Scanner j=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=j.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	
	String []str=new String[5];
	for(int i=0;i<5;i++) {
		str[i]=j.next();
	}
	System.out.println(Arrays.toString(str));
	str[3]="fg";//string array can be changed
	System.out.println(Arrays.toString(str));

	}
}



package Strings;

import java.util.Scanner;

public class Length_of_the_string_without_using_strlen_function {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String a[]=s.split("");
		int c=0;
		for(String i:a) {
			c+=1;
		}
		System.out.println(c);
    	}

}

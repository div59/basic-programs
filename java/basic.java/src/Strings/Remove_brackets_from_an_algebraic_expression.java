package Strings;


import java.util.Scanner;

public class Remove_brackets_from_an_algebraic_expression {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s =scanner.next();
		char [] a=s.toCharArray();
		for(char i :a) {
			if(i!=')' && i!='(' ) {	
				System.out.print(i);
			}
			
	}

}
}

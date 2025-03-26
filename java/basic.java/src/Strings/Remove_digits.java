package Strings;

import java.util.Scanner;

public class Remove_digits {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s =scanner.next();
		for(char i:s.toCharArray()) {
			char k=i;
			int j=i-'0';
			if(j!=1 && j!=2&&j!=3&&j!=4&&j!=5&&j!=6&&j!=7&&j!=8&&j!=9) {
				System.out.print(k);
			}
		}
	}

}

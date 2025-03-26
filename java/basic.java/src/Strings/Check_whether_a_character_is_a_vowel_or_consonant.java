package Strings;

import java.util.Scanner;

public class Check_whether_a_character_is_a_vowel_or_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		char c1=scanner.next().charAt(0);
		char c=Character.toLowerCase(c1);
		 //char s = Character.toLowerCase(sc.next().charAt(0));
		char [] a= {'a','e','i','o','u'};
		int g=0;
	     for(char f:a) {
	    	 if(f==c) {
	    		 g=1;
	    		 break;
	    	 }
	    	 
	     }
	     if(g==1) {
	    	System.out.println("even"); 
	     }
	     else {
	    	 System.out.println("odd");
	     }

	}

}

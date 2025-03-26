package arrays;

import java.util.Scanner;

public class Vowel_Count_in_String {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String s1=sc.nextLine();
	char s[]=s1.toCharArray();
	int i=0;
	for(char c:s){
	    if (Character.isLowerCase(c)){
	        i+=1;
	    }
	}
	if(i>0){
	    System.out.print(i);
	}
	else{
	    System.out.print("noo");
	}
}
}

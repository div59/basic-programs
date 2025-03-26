package Strings;

import java.util.*;
public class Find_non_repeating_characters_in_a_string
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String a[]=s1.split("");
		ArrayList<String> b=new ArrayList<>(Arrays.asList(a));
		for(String c:b){
		    if(Collections.frequency(b,c)==1){
		        System.out.print(c+" ");
		    }
		}
		
	}
}

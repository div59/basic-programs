package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longest_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("divya","pritham","aaru");
		String k="";
		int l=0;
		for(String i:s) {
			if(i.length()>l) {
				l=i.length();
				k=i;
			}
		}
		System.out.println(k);
		
		
		
	}

}

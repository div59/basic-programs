package practice;

import java.util.Arrays;
import java.util.List;

public class Remove_Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("madam", "hello", "racecar", "world", "level");
		 
		for(String i:s) {
			String st=new StringBuilder(i).reverse().toString();
			if(!st.equals(i)) {
				System.out.println(i);
			}
		}
		
		

	}

}

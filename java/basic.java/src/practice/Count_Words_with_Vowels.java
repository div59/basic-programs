package practice;

import java.util.Arrays;
import java.util.List;

public class Count_Words_with_Vowels {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("sky", "apple", "try", "orange", "fly","akk","kki");
		int c=0;
		for(String i:l1) {
			i=i.toLowerCase();
//			if(i.contains("a") || i.contains("e") || i.contains("i") || i.contains("o")|| i.contains("u")) {
			if(i.matches(".*[aeiou].*")) {
				c++;
			}
		}
		System.out.println(c);
	}

}

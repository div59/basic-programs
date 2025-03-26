package practice;

import java.util.Arrays;

public class Remove_Vowels {

	public static void main(String[] args) {
		String s1="Beautiful".toLowerCase();
		String s[] =s1.split("");
//		System.out.println(Arrays.toString(s));
		for(String i:s) {
			if(!"aeiou".contains(i)) {
				System.out.print(i+"");
			}
		}
	}

}

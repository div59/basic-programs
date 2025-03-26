package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter_Strings_Based_on_Length {

	public static void main(String[] args) {
		List<String> l1=Arrays.asList("cat", "elephant", "dog", "tiger", "ant");
		int l=4;
		List<String> k=new ArrayList<>();
		for(String s:l1) {
			if(s.length()>l) {
				k.add(s);
			}
		}
		System.out.println(k);

	}

}

package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Count_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		List<String> l1=Arrays.asList(s.split(""));
		
		String c="l";
		int v=Collections.frequency(l1, c);
		System.out.println(v);
		}
	}



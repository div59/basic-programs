package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculate_frequency_of_characters_in_a_string {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String s=scanner.next();
		HashMap<Character, Integer> d=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char k=s.charAt(i);
			d.put(k,d.getOrDefault(k,0)+1);
		}
		for(Map.Entry<Character, Integer> entry :d.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}

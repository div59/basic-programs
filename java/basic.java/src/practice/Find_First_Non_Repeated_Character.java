package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_First_Non_Repeated_Character {
	public static void main(String[] args) {
	String s="swiss";
	List<String> s1=Arrays.asList(s.split(""));
	for(String i:s1) {
		if(Collections.frequency(s1,i)==1) {
			System.out.println(i);
			break;
		}
	}

}
}

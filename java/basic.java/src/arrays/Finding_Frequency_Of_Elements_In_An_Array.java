package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Finding_Frequency_Of_Elements_In_An_Array {

	public static void main(String[] args) {
		/*
		 * 10 20 10 10 20 30 45 30 30 4 5
			10 :: 3
			20 :: 2
			30 :: 3
			45 :: 1
			4 :: 1
			5 :: 1
		 */
Scanner scanner=new Scanner(System.in);
String s1=scanner.nextLine();
String s[]=s1.split(" ");
int a[]=new int[s.length];
for(int i=0;i<s.length;i++) {
	a[i]=Integer.valueOf(s[i]);
}
LinkedHashMap<Integer, Integer> h=new LinkedHashMap<>();
for(int i:a) {
if(!h.containsKey(i)) {
	h.put(i, 1);
}
else {
	h.put(i, h.get(i)+1);
}
}

for(Map.Entry<Integer, Integer> e:h.entrySet()) {
	System.out.println(e.getKey()+ ":" + e.getValue());
}
	}

}

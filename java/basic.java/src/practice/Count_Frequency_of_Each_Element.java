package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Frequency_of_Each_Element {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(3, 5, 3, 3, 7, 5, 9);
		HashMap<Integer, Integer> m=new HashMap<>();
		for(Integer i:a) {
			m.put(i, m.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e:m.entrySet()) {
			System.out.println(e.getKey() + "->" + e.getValue());
		}
		
	}

}

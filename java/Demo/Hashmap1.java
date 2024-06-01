package Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap1 {

	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<>();
		//it stores the data in the form of key:value
		m.put("divya", 5);
		m.put("prith", 9);
		m.put("reecha", 3);
		m.put("aish", 13);
		System.out.println(m);
		
		if(!m.containsKey("aaru")){
			m.put("aaru", 14);
		}
		System.out.println(m);
		System.out.println("\n");
		
		System.out.println(m.containsValue(13));
		System.out.println(m.isEmpty());
		
		System.out.println("\n");
		
		for(Map.Entry<String, Integer> e:m.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println("\n");
		
		for(String s:m.keySet()) {
			System.out.println(s);
		}
		System.out.println("\n");
		for(Integer i:m.values()) {
			System.out.println(i);
			}
		
	}
		
		
		
		

}

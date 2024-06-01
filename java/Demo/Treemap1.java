package Demo;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		Map<String, Integer> n=new TreeMap<>();
		//it stores the data in the form of key:valu
		//it returns data in the sorted form of keys
		n.put("divya", 5);
		n.put("prith", 9);
		n.put("reecha", 3);
		n.put("aish", 13);
		System.out.println(n);
		
		
		
		
		Map<Integer, Integer> k=new TreeMap<>();
		//it stores the data in the form of key:valu
		//it returns data in the sorted form of keys
		k.put(3, 5);
		k.put(7, 9);
		k.put(1, 100);
		System.out.println(k);
		k.remove(7);
		System.out.println(k);
		
		}
		

	}



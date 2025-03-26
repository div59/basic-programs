package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import builtin_functions.sort;

public class Group_Words_by_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1=Arrays.asList("cat", "dog", "elephant", "tiger", "ant");
		HashMap<Integer, List<String>> m=new HashMap<>();
		for(int i=0;i<l1.size();i++) {
			int l=l1.get(i).length();
			if(!m.containsKey(l)) {
				m.put(l, new ArrayList<>());
			}
			m.get(l).add(l1.get(i));
		}
		
		for(Map.Entry<Integer, List<String>> e: m.entrySet()) {
			System.out.print(e.getKey()+"--->> ");
			System.out.println(e.getValue());
		}
		

	}

}

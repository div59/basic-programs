package builtin_functions;

import java.util.HashMap;

public class keySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> k=new HashMap<>();
		for(int i=0;i<5;i++) {
			k.put(i, i*2);
		}
		
		System.out.println(k.keySet());
		System.out.println(k.values());
		System.out.println(k);
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		hashMap.put(10, 100);
		hashMap.put(20, 200);
		k.putAll(hashMap);
		System.out.println(k);
		k.clear();
		System.out.println(k);

	}

}

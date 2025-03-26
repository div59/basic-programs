package builtin_functions;

import java.util.HashMap;

public class containsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> k=new HashMap<>();
		for(int i=0;i<5;i++) {
			k.put(i, i*2);
		}
		System.out.println(k.containsKey(9));
		System.out.println(k.containsKey(2));
	}

}

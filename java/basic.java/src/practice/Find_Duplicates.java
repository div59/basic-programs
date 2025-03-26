package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

public class Find_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		List<Integer> l1=Arrays.asList(10, 20, 10, 30, 20, 40);
		List<Integer> l2=new ArrayList<>();
		for(Integer i:l1) {
			if(Collections.frequency(l1, i)>1) {
				l2.add(i);
				
		}
		}
		LinkedHashSet<Integer> set=new LinkedHashSet<>(l2);
		System.out.println(set);
	}

	}



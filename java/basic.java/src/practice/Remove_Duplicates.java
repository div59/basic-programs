package practice;

import java.lang.foreign.VaList.Builder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String s="programming";
		String s1[]=s.split("");
		
		List<String> l1=Arrays.asList(s1);
		HashSet<String> ss=new LinkedHashSet<>(l1);
		
		System.out.println(",".join("", ss));
	}

}

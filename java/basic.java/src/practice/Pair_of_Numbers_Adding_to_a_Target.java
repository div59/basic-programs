package practice;

import java.util.Arrays;
import java.util.List;

public class Pair_of_Numbers_Adding_to_a_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(1,2,3,4,5);
		int t=5;
		for(int i=0;i<a.size();i++) {
			for(int j=i+1;j<a.size();j++) {
				if(a.get(i)+a.get(j)==t) {
					System.out.println(a.get(i)+" "+a.get(j));
				}
			}
		}
	}

}

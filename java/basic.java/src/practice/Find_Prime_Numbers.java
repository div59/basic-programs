package practice;


import java.util.Arrays;
import java.util.List;

public class Find_Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
		Find_Prime_Numbers k=new Find_Prime_Numbers();
		for(Integer i:l1) {
			if(k.isprime(i)) {
				System.out.println(i);
			}
		}
		

	}

	private  boolean isprime(Integer j) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=Math.sqrt(j);i++) {
			if(j%i==0) {
				
				return false;
			}
		}
			
			
		return true;
	}

}

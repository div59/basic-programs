package Demo.LabdaFunction;

import java.util.*;


public class LabdaFunction {
	public static void main(String[] arg) {
		ArrayList<Integer> arr=new ArrayList<>();
//		for(int i=0;i<5;i++) {
//			arr.add(i+2);
//		}
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr.add(s.nextInt());
		}
		
//		labda function
		arr.forEach((item)->System.out.println(item*2));
	}

}

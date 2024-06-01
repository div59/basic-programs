package Demo.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert2 {
	public static void main(String [] arg) {
		Integer arr[]= {1,2,3,4};
		//now we r gonna convert this to arraylist
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
		System.out.println(a);
		
		
	}

}

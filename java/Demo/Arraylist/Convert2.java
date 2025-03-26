package Demo.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert2 {
	public static void main(String [] arg) {
		Integer arr[]= {1,2,3,4};
		//now we r gonna convert this to arraylist
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(arr));
		
		
		//List<String> list = Arrays.asList(array);
//		When you create a list using Arrays.asList(array), the list that is returned is fixed-size, 
//		meaning it does not support operations like add(), remove(), or clear(). This list is backed by the original array, 
//		and its size is determined by the array. While you can modify the elements (i.e., set elements at specific positions), 
//		you cannot change the size of the list.
		System.out.println(a);
		
		
	}

}

package Demo;
import java.util.*;
public class Arrayclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,88,99};
		int i=Arrays.binarySearch(a, 88); // for this the array must be in sorted form
		System.out.println("index " + i);
	    int [] b= {4,6,3,8,1,9,10,5};
		Arrays.sort(b);
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println("\n");
		System.out.println(Arrays.compare(a, b));
		
		

	}

}

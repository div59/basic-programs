package builtin_functions;
import java.util.*;
public class Arrays_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int b[]=Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(b));
	}

}

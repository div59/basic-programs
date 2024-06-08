
/*
Find Largest element in an array*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
// 		Integer a[]={4,3897,1,7,8,9,987};
// 		ArrayList<Integer> l=new ArrayList<>(Arrays.asList(a));
// 		System.out.println(Collections.max(l));
// 			System.out.println(Collections.min(l));
        int a[]={4,3897,1,7,8,9,987};
        Arrays.sort(a);
        
        System.out.println(a[a.length -1]);
		
	}
}

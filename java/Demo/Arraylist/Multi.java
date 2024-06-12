package Demo.Arraylist;
import java.util.*;

public class Multi {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//		List<Integer> kIntegers=new List<>(); cant
		
		
		Scanner in =new Scanner(System.in);
		//1st we have to initialize the arraylist
		for(int i=0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		// add elements
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list.get(i).add(in.nextInt());
			}
		}
		System.out.println(list);
		
		
		
		
		
		
	}

}

package Demo.Arraylist;
import java.util.*;

public class Basic {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(7);
		Scanner g=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			list.add(g.nextInt());
		}
		for(int i=0;i<5;i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		
		ArrayList<Integer> l=new ArrayList<>(1);//size doesnt matter
		l.add(3);
		l.add(4);
		l.add(8);
	    System.out.println(l);
		l.set(2, 9);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.clear();
		System.out.println(l);
		
		
		
		}

}

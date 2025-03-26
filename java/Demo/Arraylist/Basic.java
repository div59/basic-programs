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
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)+ " ");
		}
		System.out.println(list);
		System.err.println("ArrayList doest have any addlast and addfirst");
		
		List<Integer> list2=new ArrayList<>();
		//List<Integer> list2=new LinkedList<>(); // has same functions as arraylist
		list2.add(99);
		list2.add(100);
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list.get(5));
		
		
		
		ArrayList<Integer> l=new ArrayList<>(1);//size doesnt matter
		l.add(3);
		l.add(1);
		l.add(8);
	    System.out.println(l);
	    
	    
	    
	    Collections.reverse(l);//reversing
	    
	    
	    
	    System.out.println(l);
	    Collections.sort(l);//sorting
	    
	    
	    System.out.println(l);
		l.set(2, 9);
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
		//l.clear();
		//System.out.println(l);
		
		
		
		System.out.println(l.contains(8));
		
		
		
		ArrayList<String> s = new ArrayList<>();
		for(int i=0;i<4;i++) {
			s.add(g.next());
		}
		Collections.reverse(s);
		System.out.println(s);
		
		Collections.sort(s);
		System.out.println(s);
		
		
		
		
		
		
		
		}

}

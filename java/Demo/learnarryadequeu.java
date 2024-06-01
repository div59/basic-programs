package Demo;
import java.util.*;

public class learnarryadequeu {
	public static void main(String args[]) {
		/*Queue<Integer> q = new ArrayDeque<>();
		q.offer(67);
		q.offerLast(8);
		//cant as here ArrayDeeque is implementing properties which queue has but queue doesnt has addlast 
		//so by using obj of queue we cant 
		//so use ArrayDequeue in the place of queue*/
		ArrayDeque<Integer> a=new ArrayDeque<>();
		Deque<Integer> d= new ArrayDeque<>();
		a.offer(2);
		a.offerLast(98);
		a.offerFirst(21);
		a.offer(88);
		System.out.println(a);
		
		d.offer(2);
		d.offerLast(98);
		d.offerFirst(21);
		d.offer(88);
		System.out.println(d);
		
		
		
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
		System.out.println();
		
		
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.pollFirst());
		System.out.println(a);
		System.out.println(a.pollLast());
		System.out.println(a);
		
	}

}

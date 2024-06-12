package Demo;

import java.util.PriorityQueue;
import java.util.*;

public class learPriority {
	public static void main(String args[]) {

//		Queue<Integer> q = new PriorityQueue<>();
		PriorityQueue<Integer> q = new PriorityQueue<>();
		// so here this priorityqueue is implementing queue so it has the properties of queue
		q.offer(34);
		q.offer(2);
		q.offer(98);
		q.offer(66);
		System.out.println(q);
		//this ll give us the min value at 1st means mean heap
		
		q.poll(); // it doesnt mantian the order as in the heap so
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println("\n");
		//max  heap
		Queue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder());
		// so here this priorityqueue is implementing queue so it has the properties of queue
		q1.offer(34);
		q1.offer(2);
		q1.offer(98);
		q1.offer(66);
		System.out.println(q1);
		//this ll give us the max value at 1st means mean heap
		
		q1.poll(); // it doesnt mantian the order as in the heap so
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1);
		
//		output
//				[2, 34, 98, 66]
//				[34, 66, 98]
//				34
//				[34, 66, 98]
//
//
//				[98, 66, 34, 2]
//				[66, 2, 34]
//				66
//				[66, 2, 34]

		
		
		}

}

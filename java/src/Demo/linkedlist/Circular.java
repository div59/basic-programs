package Demo.linkedlist;

import Demo.linkedlist.Doubly.Node;

public class Circular {
	Node headNode;
	Node tailNode;
	public Circular() {
		this.headNode=null;
		this.tailNode=null;
	}
	class Node{
		int val;
		Node nextNode;
		public Node(int val) {
			this.val=val;
		}
	}
	
	
	//insert between head and tail
	void insert(int val) {
		
		Node node=new Node(val);
		if(headNode==null) {
			headNode=node;
			tailNode=node;
		}
		tailNode.nextNode=node;
		node.nextNode=headNode;
		tailNode=node;
		
}
//	void delete(int val) {
//		Node tempNode=headNode;
//		Node preNode=headNode;
//		if(headNode==null) {
//			return ;
//		}
//		if(headNode.val==val) {
//			tailNode.nextNode=headNode.nextNode;
//		}
//		while(tempNode.val!=val) {
//			tempNode=tempNode.nextNode;
//			
//		}
//		while(preNode.nextNode.val!=val) {
//			preNode=preNode.nextNode;
//		}
//		preNode.nextNode=tempNode.nextNode;
//		
//	}
	void print() {
		Node tempNode=headNode;
		if(headNode!=null) {
			do {
				System.out.print(tempNode.val +"->");
				tempNode=tempNode.nextNode;
			}while(tempNode!=headNode);
			
		}
		
		System.out.println("end");
	}
	

	public static void main(String[] args) {
		Circular circular=new Circular();
		circular.insert(1);
		circular.insert(5);
		circular.insert(10);
		circular.insert(100);
		circular.insert(34);
		circular.insert(99);
		circular.insert(88);
		circular.insert(56);
		circular.print();
		//circular.delete(10);
		circular.print();
		//circular.delete(1);
		circular.print();
	}

}

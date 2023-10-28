package Demo.linkedlist;

import Demo.linkedlist.customSingle.Node;

public class Doubly {
	Node headNode;//it pointing to null
	
	void insertfirst(int val) {
		Node node=new Node(val);
		node.nextNode=headNode;
		node.preNode=null;
		if(headNode!=null) {
			headNode.preNode=node;
		}
		headNode=node;
	}
	
	
	public void print() {
		Node tempNode=headNode;
		while(tempNode!=null) {
			System.out.print(tempNode.val + " ->");
			tempNode=tempNode.nextNode;
		}
		System.out.println("end");
		System.out.println();
		
		
	}
	
	
	public void reverse() {
		Node tempNode=headNode;
		Node lastNode=null;
		while(tempNode!=null) {
			lastNode=tempNode;
			tempNode=tempNode.nextNode;
		}
		while(lastNode!=null) {
			System.out.print(lastNode.val + " ->");
			lastNode=lastNode.preNode;
		}
		System.out.println("end");
		
	}
//	Node tempNode=headNode;
//	Node lastNode=null;
//	while(tempNode.nextNode!=null) {
//		tempNode=tempNode.nextNode;
//	}
//	while(tempNode!=null) {
//		System.out.print(tempNode.val + " ->");
//		tempNode=tempNode.preNode;
//	}
//	System.out.println("end");
//	
	void insertlast(int val) {
		Node node=new Node(val);
		Node lastNode=headNode;
		node.nextNode=null;
		if(headNode==null) {
			headNode.preNode=null;
			headNode=node;
			return;
		}
		while(lastNode.nextNode!=null) {
			lastNode=lastNode.nextNode;
			
		}
		lastNode.nextNode=node;
		node.preNode=lastNode;
	}
	
	void insert(int index,int val) {
		Node node=new Node(val);
		Node pNode=headNode;
		for(int i=1;i<index;i++) {
			pNode=pNode.nextNode;
		}
		node.nextNode=pNode.nextNode;
		pNode.nextNode=node;
		node.preNode=pNode;
		if(node.nextNode!=null) {
			node.nextNode.preNode=node;
		
		}
		
		
	}
	public Node find(int val) {
		Node node=headNode;
		while(node!=null) {
			if(node.val==val) {
				return node;
			}
			node=node.nextNode;
		}
		return null;
		
	}
	void insertafter(int after,int val) {
		Node node=new Node(val);
		Node pNode=find(after);
		if(pNode==null) {
			System.out.println("does not exist");
			return;
		}
		
		node.nextNode=pNode.nextNode;
		pNode.nextNode=node;
		node.preNode=pNode;
		if(node.nextNode!=null) {
			node.nextNode.preNode=node;
		
		}
		
		
	}
	
	
	class Node{
		int val;
		Node nextNode;
		Node preNode;
		public Node(int val) {
			this.val=val;
	}
		
}

	public static void main(String[] args) {
		Doubly d=new Doubly();
		//for(int i=1;i<20;i++) {
		d.insertfirst(976);
		//}
		d.insertfirst(6);
		d.insertfirst(7);
		d.insertfirst(8);
		d.print();
		System.out.println("in reverse" );
		d.reverse();
		d.insertlast(4);
		d.insertlast(3);
		//d.reverse();
		d.print();
		d.insert(3, 99);
		d.print();
		d.insertafter(99, 98);
		d.print();
		d.insertafter(100, 87);
		//d.print();
	}

}

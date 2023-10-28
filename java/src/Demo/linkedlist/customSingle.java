package Demo.linkedlist;

public class customSingle {
	private Node headNode;
	private Node tailNode;//constant time
	static  int size=0;
	
	class Node{
		private int val;
		private Node nextNode;
		public Node(int val) {
			this.val=val;
			
		}
		
		
//		public Node(int val,Node nextNode) {
//			this.val=val;
//			this.nextNode=nextNode;
//		}
		
		
}
	void insertatfront(int val) {
		Node node=new Node(val);
		node.nextNode=headNode;
		headNode=node;
		
		if(tailNode==null) {
			tailNode=headNode;
			return;
		}
	     size+=1;
	}
	
	
	
	void insertlast(int val) {
		if(tailNode==null) {
			insertatfront(val);
		}
		else {
		Node node =new Node(val);
		tailNode.nextNode=node;
		tailNode=node;
		size+=1;
		}
	}
	
	
	
	void insert(int val,int index) {
		if(index==0) {
			insertatfront(val);
		}
		else if(index==size) {
			insertlast(val);
			
		}
		else {
			Node tempNode=headNode;
			for(int i=1;i<index;i++) {
				tempNode=tempNode.nextNode;
			}
			Node node=new Node(val);
			node.nextNode=tempNode.nextNode;
			tempNode.nextNode=node;
			size++;
			
		}
			
			
		
			
}
	int deletefront() {
		if(headNode==null) {
			tailNode=null;
		}
		int val=headNode.val;
		headNode=headNode.nextNode;
		size--;
		return val;
	}
	
	
	int delete(int index) {
		if(index==0) {
			deletefront();
			return 0;
			}
		
			Node tempNode=headNode;
			Node curNode=headNode;
			for(int i=1;i<index;i++) {
				tempNode=tempNode.nextNode;
			}
			for(int i=1;i<=index;i++) {
				curNode=curNode.nextNode;
			}
			tempNode.nextNode=curNode.nextNode;
			int val=curNode.val;
		size--;	
		return val;
	}
	
	
	
	int deletelast() {
		if(headNode==null) {
			tailNode=null;
		}
		Node tempNode=headNode;
		Node preNode=headNode;
		while(tempNode.nextNode!=null) {
			tempNode=tempNode.nextNode;
		}
		int val=tempNode.val;
		while(preNode.nextNode!=tempNode) {
			preNode=preNode.nextNode;
		}
		preNode.nextNode=null;
		size--;
		return val;
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
	
	
	
	
	void print() {
		Node tempNode;
		tempNode=headNode;
		while(tempNode!=null) {
			System.out.print(tempNode.val+ "->");
			tempNode=tempNode.nextNode;
					}
		System.out.println("END");
		
	}

	public static void main(String[] args) {
		customSingle n=new customSingle();
		n.insertatfront(4);
		n.insertatfront(89);
		n.insertatfront(21);
		n.insertatfront(98);
		n.insertatfront(100);
		n.print();
		System.out.println();
		n.insertlast(7);
		n.insertlast(78);
		n.print();
		System.out.println();
		System.out.println( "size is" + size);
		n.insert(45, 4);
		n.insert(59, 2);
		n.print();
		System.out.println();
		System.out.println(n.deletefront());
		n.print();
		System.out.println();
		System.out.println(n.deletefront());
		n.print();
		System.out.println();
		System.out.println(n.delete(3));
		n.print();
		System.out.println();
		System.out.println("last element"+ " " + n.deletelast());
		n.print();
		System.out.println();
		System.out.println( "size is" + size);
		System.out.println(n.find(4));
		n.print();
		
		
		
		
	}

}

package datastructures;

class Node{
	Node nextPointer;
	Object value;
	public Node(Node nextPointer, Object value) {
		super();
		this.nextPointer = nextPointer;
		this.value = value;
	}

}
public class LinkedList<T> {
	Node head;
	public LinkedList() {
		head=null;
	}
	
	public void add(Object value) {
		Node newnode= new Node(null, value);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.nextPointer=head;
			head=newnode;
		}
		
	}
	public void delete() 
	{
		head=head.nextPointer;
	}
	
	public void display() {
		Node n= head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.nextPointer;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(5);
		list.add(5);
		list.add(4);
		list.display();

	}

}

package datastructures;



class NodeD{
	NodeD nextPointer;
	NodeD prevPointer;
	Object value;
	public NodeD(NodeD nextPointer, NodeD prevPointer, Object value) {
		super();
		this.nextPointer = nextPointer;
		this.prevPointer = prevPointer;
		this.value = value;
	}
	
	
}

public class DoubleLinkedList<T>{
	NodeD head;

	public DoubleLinkedList() {
		head=null;
	}
	
	public void add(Object value) {
		NodeD newnode= new NodeD(null, null, value);
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.nextPointer=head;
			head.prevPointer=newnode;
			newnode=head;
			
		}
			
		
	}
	
	public void delete() {
		head.nextPointer=head;
		head.prevPointer=null;
	}
	
public void display() {
	NodeD n= head;
	while(n!=null) {
		System.out.println((T)n.value);
		n=n.nextPointer;
	}
	
	}
	public static void main(String[] args) {
		DoubleLinkedList<Integer> list=new DoubleLinkedList<Integer>();
		list.add(4);
		list.add(3);
		list.add(4);
		list.display();

	}

}

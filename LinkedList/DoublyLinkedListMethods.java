package LinkedList;

public class DoublyLinkedListMethods {

	private Node head;
	private Node tail;
	private int size;

	public DoublyLinkedListMethods() {
		this.size = 0;
	}

	private class Node {
		int value;
		Node next;
		Node previous;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next, Node previous) {
			super();
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}
	
	public void insertFirst(int value)
	{
		Node node = new Node(value);
		node.next=head;
		node.previous=null; 
		if(head!=null)
		head.previous=node;
		head=node;
		if(tail==null)
			tail=head;
		size++;
	}
	
	public void insertLast(int value)
	{
		Node node = new Node(value);
		node.previous=tail;
		tail.next=node;
		tail=node;
		node.next=null;
		size++;
		
	}
	
	public void insert(int index, int value)
	{
		if(index == 0) {
			insertFirst(value);
			return;
		}
		if(index==size)
		{
			insertLast(value);
			return;
		}
		Node node = new Node(value);
		Node previousNode = getPreviousNode(index);
		node.next=previousNode.next;
		node.next.previous=node;
		previousNode.next = node;
		node.previous = previousNode;
		
		
	}
	
	public Node getPreviousNode(int index)
	{
		Node node = head;
		for(int i=1; i<index;i++)
		{
			node=node.next;
		}
		return node;
	}
	
	
	public void display()
	{
		Node node= head;
		//Node last =null;
		
		while(node!=null)
		{
			System.out.print(node.value+" -> ");
			//last=node;
			node=node.next;
		}
		System.out.print("START");
	}
	
	public void displayReverse()
	{
		Node node =tail;
		System.out.println("Print in reverse");
		while(node!=null)
		{
			System.out.print(node.value+" -> ");
			node=node.previous;
		}
		System.out.print("END");
	}
}

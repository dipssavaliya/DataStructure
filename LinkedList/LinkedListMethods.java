package LinkedList;

import ch.qos.logback.core.joran.action.NewRuleAction;

public class LinkedListMethods {

	private Node head;
	private Node tail;

	private int size;

	public LinkedListMethods() {
		this.size = 0;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null)
			tail = head;

		size += 1;
		//System.out.print("tail = " + tail.value + " ");
	}

	public void insert(int value, int index) {
		if (index == 0) {
			insertFirst(value);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;

	}

	public void insertLast(int value) {
		if (tail == null) {
			insertFirst(value);
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
		System.out.println("END");
		
	}

	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (head == null)
			tail = null;
		size--;
		return val;
	}

	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}

	public int deleteLast() {
		if (size == 1) {
			return deleteFirst();
		}
		Node secondLast = get(size - 2);
		int value = tail.value;
		tail = secondLast;
		tail.next = null;
		return value;
	}
	
	public int delete(int index)
	{
		if(index==0)
		{
			deleteFirst();
		}
		if(index==size-1)
		{
			deleteLast();
		}
		Node previous = get(index-1);
		int val = previous.next.value; 
		previous.next=previous.next.next;
		return val;
	}
	
	public Node find(int value)
	{
		Node node = head;
		while(node!=null)
		{
			if(node.value==value)
				return node;
			node=node.next;
		}
		return null;
	}

	
	//test methods
	
	public int getDecimalValue(ListNode head) {
        /*int sum=0;
        while(head!=null)
        {
            sum=sum*2;
            sum=sum+head.val;
            head=head.next;
        }
        return sum;*/
        
        int ans=0;
        int power=0;
        while(head.next!=null)
        {
            ans+=head.val*(Math.pow(2,power));
            head=head.next;
            power++;
        }
        return ans;
    }
}

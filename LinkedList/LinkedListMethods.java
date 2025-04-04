package LinkedList;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class LinkedListMethods {
	private class Node {
		private int value;
		private Node next;
		private Node prev;

		public Node(int value) {
			super();
			this.value = value;
			this.next=null;
			this.prev=null;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}


	private Node head;
	private Node tail;

	private int size;

	public LinkedListMethods() {
		this.size = 0;
	}


	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;

		if (tail == null)
			tail = head;

		size += 1;
		System.out.print("tail = " + tail.value + " ");
		System.out.print("head = " + head.value + " ");
	}

//	public void insert(int value, int index) {
//		if (index == 0) {
//			insertFirst(value);
//			return;
//		}
//		Node temp = head;
//		for (int i = 1; i < index; i++) {
//			temp = temp.next;
//		}
//		Node node = new Node(value, temp.next);
//		temp.next = node;
//		size++;
//
//	}

	public void insert(int value)
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
		}
		else {
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			current.next = newnode;
			tail = newnode;
			//tail.prev=current;
		}
	}

	public void deleteNodeAtIndex(int index) {
		for (int i = 1; i <= index; i++)
		{
			tail=tail.prev;
		}
		tail.prev.next=tail.next;
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


	public Node swapPairs(Node node) {
		Node dummy = new Node(0);
		dummy.next = node;
		Node current = dummy;

		while (current.next != null && current.next.next != null) {
			// Identify the nodes to swap
			Node first = current.next;
			Node second = current.next.next;

			// Perform the swap
			first.next = second.next;
			second.next = first;
			current.next = second;

			// Move to the next pair
			current = current.next.next;
		}

		return dummy.next;
	}
		//2,7,4,3,5
		//[1,7,5,1,9,2,5,1]
	public int[] nextLargerNodes(Node head) {
		Node current = head;
		Stack<Integer> stack = new Stack<>();
		while(current!=null)
		{
			stack.push(current.value);
			current = current.next;
		}
		int[] arr = new int[stack.size()];
		int arrlength = arr.length;
		int peek = stack.peek();
		while(!stack.isEmpty()) {
			arrlength--;
			int popped = stack.pop();
			if(peek>popped) {
				//popped=stack.pop();
				arr[arrlength] = peek;
			}
			else if(peek==popped)
			{
				arr[arrlength] = 0;
			}
			else {
				peek=popped;
				arr[arrlength]=0;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		LinkedListMethods lm = new LinkedListMethods();

		lm.insert(2);
		lm.insert(7);
		lm.insert(4);
		lm.insert(3);
		lm.insert(5);

		lm.display();
		System.out.print(Arrays.toString(lm.nextLargerNodes(lm.head)));
		//lm.display();
		//lm.deleteNodeAtIndex(2);
	}

}

package LinkedList;


public class ListNode {
	int val;
	ListNode next;
	ListNode head;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public void insertFirst(int value) {
		ListNode node = new ListNode(value);
		node.next = head;
		head = node;

		//System.out.print("tail = " + tail.value + " ");
	}
}
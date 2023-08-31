package LinkedList;


public class palindrom {
	
	public static void main(String[] args) {
	ListNode node= new ListNode();
	node.insertFirst(3);
	node.insertFirst(1);
	node.insertFirst(1);
	node.insertFirst(2);
	boolean ans = isPalindrome(node);
	System.out.print(ans);
	
	}
	  public static boolean isPalindrome(ListNode head) {
	     //   if (head == null || head.next == null) return true;

	        ListNode reversed = null;
	        ListNode slow = head;
	        ListNode fast = head;

	        // found middle of list
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        // reversed second half of list
	        while (slow != null) {
	            ListNode next = slow.next;
	            slow.next = reversed;
	            reversed = slow;
	            slow = next;
	        }

	        // compared first and second half
	        while (reversed != null) {
	            if (head.val != reversed.val) return false;
	            head = head.next;
	            reversed = reversed.next;
	        }

	        return true;
	    }
}

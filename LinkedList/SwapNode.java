package LinkedList;

import java.util.List;
class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1 head;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }

    public void insertFirst(int value) {
        ListNode1 node = new ListNode1(value);
        node.next = head;
        head = node;
    }

    public void display() {
        ListNode1 temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");

    }
}
public class SwapNode {
    public static void main(String[] args) {
        ListNode node= new ListNode();
        node.insertFirst(5);
        node.insertFirst(4);
        node.insertFirst(3);
        node.insertFirst(2);
        node.insertFirst(1);
        //node.display();
        //ListNode head;
        ListNode n = swapNodeMethod(node);
       // n.display();
    }
    private static ListNode swapNodeMethod(ListNode head) {
   // System.out.println(node.head.val + "->");
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapNodeMethod(head.next.next);
        n.next = head;
        return n;

    }
}

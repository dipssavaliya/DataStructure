package LeetcodePractice;


class Node {
      private Node head;
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }

      public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
	}
    public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("END");
		
	}
  }
public class addNumbersLinkedlist {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.insertFirst(2);
        n1.insertFirst(4);
        n1.insertFirst(6);
        n1.display();
        Node n2 = new Node();
        n2.insertFirst(4);
        n2.insertFirst(6);
        n2.insertFirst(9);
        n2.display();
        Node n3 = addNumbers(n1,n2);
        n3.display();
    }
    static int count=0;
    private static Node addNumbers(Node n1, Node n2) {
       
        if(n1==null && n2==null && count==0)
        {
            return null;
        }
        int val1 = (n1==null?0:n1.val);
        int val2 = (n2==null?0:n2.val);

        int sum = val1+val2+count;
        count=sum/10;

        n1 = n1 == null ? null : n1.next; 
        n2 = n2 == null ? null : n2.next;

        Node ans = new Node(sum%10,addNumbers(n1,n2));
        return ans;

    }
}

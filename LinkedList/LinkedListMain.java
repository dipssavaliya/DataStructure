package LinkedList;

public class LinkedListMain {
	
	public static void main(String[] args)
	{
		LinkedListMethods lm = new  LinkedListMethods();
		lm.insertFirst(60);
		lm.display();
		lm.insertFirst(50);
		lm.insertFirst(40);
		lm.insertFirst(30);
		lm.insertFirst(20);
		lm.display();
		lm.insert(25, 1);
		lm.display();
		lm.insertLast(70);
		lm.display();
		//System.out.println(lm.deleteFirst());
		//System.out.println(lm.deleteLast());
		lm.display();
		System.out.println(lm.delete(3));
		lm.display();
	}

}

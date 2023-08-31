package LinkedList;

public class DoublyLinkListMain {

	public static void main(String[] args) {
	DoublyLinkedListMethods dm = new DoublyLinkedListMethods();
	dm.insertFirst(60);
	dm.insertFirst(50);
	dm.insertFirst(40);
	dm.insertFirst(30);
	dm.insertFirst(20);
	//dm.display();
	//dm.displayReverse();
	dm.insertLast(70);
	dm.insert(1, 25);
	dm.display();
	
	}
}

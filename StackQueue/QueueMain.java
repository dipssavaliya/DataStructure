package StackQueue;

public class QueueMain {

	public static void main(String[] args)
	{
		CustomeQueue queue = new CustomeQueue();
		queue.push(10);
		queue.push(20);
		queue.push(30);
		
		queue.display();
		
		queue.pop();
		queue.display();
		
	}
}

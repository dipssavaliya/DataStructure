package StackQueue;

public class CustomeQueue {
	private static final int DEFAULT_SIZE = 10;
	protected int[] data;
	private int end;

	public CustomeQueue() {
		this(DEFAULT_SIZE);
	}

	public CustomeQueue(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return end == data.length - 1;
	}

	public boolean isEmpty() {
		return end == -1;
	}

	public int push(int item) {
		if (isFull()) {
			System.out.println("Queue is FULL");
		}
		data[end++] = item;
		return item;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		int removed = data[0];
		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;
		return removed;
	}
	
	public void display()
	{
		for(int i=0;i<end;i++)
		{
			System.out.print(data[i]+" "+" <- ");
		}
		System.out.println("END");
	}
	
}

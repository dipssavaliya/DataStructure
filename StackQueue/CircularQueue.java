package StackQueue;

public class CircularQueue {
	protected int[] data;
	protected int end;
	protected int start;
	protected int size;
	private static final int DEFAULT_SIZE = 10;

	public CircularQueue() {
		this(DEFAULT_SIZE);
	}

	public CircularQueue(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return size == data.length - 1;
	}

	public boolean isEmpty() {
		return size == -1;
	}

	public boolean add(int item) {
		if (isFull()) {
			System.out.println("Queue is FULL");
			return false;
		}
		data[end++] = item;
		end=end%size;
		return true;
	}

	public int remove() {
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

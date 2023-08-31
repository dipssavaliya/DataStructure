package StackQueue;

public class customStack {

	protected int[] data;
	int ptr;

	private static final int DEFAULT_SIZE = 10;

	public customStack() {
		this(DEFAULT_SIZE);
	}

	public customStack(int size) {
		this.data = new int[size];
	}

	public int push(int item) {
		if (isFull()) {
			System.out.println("The stack is full");

		}

		ptr++;
		data[ptr] = item;
		return item;
	}

	public boolean isFull() {
		return ptr == data.length - 1;
	}

	public int pop(int item) {
		if (isEmpty()) {
			System.out.println("Th stack is empty");
		}

//		int removed=data[ptr];
//		ptr--;
		return data[ptr--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
		}

		return data[ptr];
	}

	private boolean isEmpty() {
		return ptr == -1;
	}

}

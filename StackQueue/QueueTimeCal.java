package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTimeCal {
	public static void main(String[] args) {
		RecentCounter obj = new RecentCounter();
		System.out.print("size: "+obj.ping(5));
		System.out.print("size: "+obj.ping(105));
		System.out.print("size: "+obj.ping(1005));
//		System.out.print("size: "+obj.ping(1050));
//		System.out.print("size: "+obj.ping(2005));
//		System.out.print("size: "+obj.ping(3005));
//		System.out.print("size: "+obj.ping(005));
//		
	}
}

class RecentCounter {
	Queue<Integer> queue;

	public RecentCounter() {
		queue = new LinkedList<>();
	}

	public int ping(int t) {
		queue.add(t);
		System.out.print("queue peek: "+"\n"+ queue.peek());
		while (queue.peek() < t - 3) {
			queue.poll();
		}
		return queue.size();
	}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * 
 */

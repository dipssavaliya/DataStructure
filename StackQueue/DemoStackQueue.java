package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoStackQueue {
	public static void main(String[] args) {
		Stack<Integer> stackD = new Stack<>();
		stackD.push(3);
		stackD.push(4);
		stackD.push(5);
		System.out.println(stackD.pop());
		System.out.println(stackD.pop());
		System.out.println(stackD.pop());
		
		Queue<Integer> queue= new LinkedList<>();
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue.offer(60));
		System.out.println(queue);
		
		System.out.println(queue.remove());
		
		Deque<Integer> deque = new ArrayDeque();
		deque.add(100);
		deque.add(200);
		deque.add(300);
		deque.add(400);
		System.out.println(deque);
		
		deque.remove();
		System.out.println(deque);
		
		deque.push(6000);
		System.out.println(deque);
	}
}

package com.day9;

public class IntroToQueue {
	public static void main(String[] args) throws Exception
	{   
		Queue q = new Queue();
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);
		q.traverse();
		q.dequeue();
		q.traverse();
	}
}

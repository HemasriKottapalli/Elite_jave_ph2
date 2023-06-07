package com.day3;

import java.util.PriorityQueue;
import java.util.Queue;

public class IntroToQueue {

	public static void main(String[] args) {
		/*
		 *Queue follows FIFO principle
		              collections
		                   |
		                 Queue
		                  |
		                 / \
		             Deque   priorityQueue 
		               |
		             ArrayDeque
		 */
		Queue q = new PriorityQueue();
		//Queue is an interface so we cannot create object of it
		q.add(10);//add
		q.add(5);
		q.add(2);
		q.add(1);
		System.out.println(q);
		q.remove(); //remove
		System.out.println(q);
		System.out.println(q.poll());//poll

	}

}

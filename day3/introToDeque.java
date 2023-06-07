package com.day3;

import java.util.ArrayDeque;
import java.util.Deque;

public class introToDeque {

	public static void main(String[] args) {
		//Basic Operations
		//add
		//offer
		//remove
		//poll
		//element
		//peek
		Deque dq = new ArrayDeque();
		dq.add(10);
		dq.add(5);
		dq.add(3);
		dq.add(1);
		dq.add(9);
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
	}

}

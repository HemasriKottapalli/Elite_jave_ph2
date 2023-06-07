package com.day3;

import java.util.Stack;

public class introToStack {

	public static void main(String[] args) {
		/*
		 * It is a linear data structure
		 * it follows FILO principle
		 * It's a class in java
		 */
		Stack s = new Stack();
        s.push(1);//push
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println( s.peek()); //peek
        System.out.println(s.pop()); // pop
        System.out.println(s.empty());//empty
        System.out.println(s.search(9));//search
        
	}

}

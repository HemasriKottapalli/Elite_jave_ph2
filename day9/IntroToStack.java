package com.day9;

public class IntroToStack {

	public static void main(String[] args) throws Exception {
			Stack as = new Stack();
			as.push(10);
			as.push(20);
			as.push(30);
			as.push(40);
			as.push(50);
			as.traverse();
			//as.push(60); throws overflow exception
			System.out.println(as.peek());

	}

}

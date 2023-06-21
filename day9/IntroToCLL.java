package com.day9;

public class IntroToCLL {

	public static void main(String[] args) {
		CircularLinkedList circ = new CircularLinkedList();
		circ.insertAtEnd(11);
		circ.insertAtEnd(12);
		circ.insertAtEnd(13);
		circ.traverse();
		circ.insertAtBeg(14);
		circ.traverse();
		circ.update(2, 15);
		circ.traverse();

	}

}

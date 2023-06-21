package com.day9;

public class IntroToDLL {

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.insertAtBeginning(0);
		dll.insertAtBeginning(2);
		dll.insertAtBeginning(9);
		dll.display();
		dll.update(2, 50000);
		dll.display();
	}

}

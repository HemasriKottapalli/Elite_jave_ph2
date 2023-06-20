package com.day8;

public class introToLinkedList {
    
	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 list.insertAtBeginning(9);
		 list.insertAtBeginning(3);
		 list.insertAtBeginning(4);
		 list.display();
		 list.insertAtPos(1,100);
		 list.display();
	}

}

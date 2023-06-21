package com.day9;
public class CircularLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void insertAtEnd(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head = newnode;
			newnode.next=head;//if node == null than createnew node and assign as head
		}
		Node temp = head;
		while(temp.next!=head){
			temp=temp.next;//moving temp node upto end i.e, temp next is null
		}
		temp.next=newnode;
		newnode.next=head;//updateing newnode next with head address
		
	}
	public void traverse() {
		if(head==null) {
			System.out.println("list is empty");//if empty
		}
		else {
			Node temp=head;//create temp node
		do {
		System.out.print(temp.data+" ");//displaying data
		temp=temp.next;	//movingg temp to next node
		}while(temp!=head);
		System.out.println();
		}
	}
	public void insertAtBeg(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head=newnode;
			newnode.next=head;
		}
		else {
			Node temp = head;
			while(temp.next!=head){
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.next=head;
			head=newnode;
			//newnode.next=head;
	        
		}
	}
	public void update(int pos,int data) {
		if(head==null) {
			System.out.println("circular linked list empty");
			return;
		}
		Node temp = head;
		int cp=1;
		do {
			if(cp==pos) {
				temp.data=data;
				return;
			}
			temp=temp.next;
			cp++;
		}while(temp!=head);
		System.out.println("invalid position");
	}
}
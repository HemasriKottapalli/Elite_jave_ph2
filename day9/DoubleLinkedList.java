package com.day9;

public class DoubleLinkedList {
       Node head;
	   class Node{
    	   int data;
    	   Node prev;
    	   Node next;
    	   Node(int data)
    	   {
    		   this.data=data;
    		   this.prev=null;
    		   this.next=null;
    	   }
       }
	   DoubleLinkedList()
	   {
		   head=null;
	   }
	   //method to insert an element
	   public void insertAtBeginning(int data)
	   {
		   Node newNode = new Node(data);
		   if(head==null)
		   {
			   head=newNode;
		   }
		   else {
			   newNode.next=head;
			   head.prev=newNode;
			   head=newNode;
		   }
	   }
	   //display
	    void display() {
	    	Node temp=head;
	    	while(temp!=null) {
	    		System.out.print(temp.data+" ");
	    	    temp=temp.next;
	    	}
	    	System.out.println();
	    }
	    //update
	    public void update(int position, int data)
	    {
	    	Node temp=head;
	    	int pos=1;
	    	while(temp!=null && pos<position)
	    	{
	    		temp=temp.next;
	    		pos++;
	    	}
	    	if(temp!=null) {
	    		temp.data=data;
	    	}
	    	else
	    	{
	    		System.out.println("Invalid position");
	    	}
	    }
}


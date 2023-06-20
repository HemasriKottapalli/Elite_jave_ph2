package com.day8;

public class LinkedList {
		Node head;
		class Node{
			int data;
			Node ptr;
			Node(int val){
				data=val;
				ptr=null;
			}
		}
		LinkedList(){
			head=null;
		}
		public void insertAtBeginning(int val)
		{
			Node newnode = new Node(val);
			if(head==null)
			{
				head=newnode;
			}else {
				newnode.ptr=head;
				head=newnode;
			}
		}
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.ptr;
			}
			System.out.println();
		}
		public void insertAtPos(int pos,int val)
		{
			if(pos==0)
			{
				insertAtBeginning(val);
			}
			Node newNode = new Node(val);
			Node temp=head;
			for(int i=1;i<pos;i++)
			{
				temp=temp.ptr;
			}
			newNode.ptr=temp.ptr;
			temp.ptr=newNode;
		}
	}


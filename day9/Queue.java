package com.day9;

public class Queue {
		static final int max_size=5;
		int arr[];
		int front,rear;
		Queue(){
			arr = new int[max_size];
			front = -1;
			rear = -1;
		}
		public void enqueue(int data) throws Exception {
			if(rear==max_size-1) {
				throw new Exception("queue overflow");
			}
			if(front==-1) {
				front++;
			}
			arr[++rear]=data;
		}
		public int dequeue() throws Exception {
			if(front==-1 || front>rear) {
				throw new Exception("Queue is empty");
			}
			return arr[front++];
		}
		public void traverse() throws Exception {
			if(front==-1 || front>rear) {
				throw new Exception("Queue is empty");
			}
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}


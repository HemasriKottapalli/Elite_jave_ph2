package com.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackExcercise1 {

	public static void main(String[] args) {
		Stack s = new Stack();
        do {
        	System.out.println("Choose a number:\n1.Push\n2.pop\n3.peek\n4.size\n5.exit");
        	int choice;
        	Scanner inp = new Scanner(System.in);
        	choice = inp.nextInt();
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Enter a number to push: ");
        		int num = inp.nextInt();
        		s.push(num);
        		break;
        	case 2:
                if(s.size()==0)
                {
                	System.out.println("Stack Underflow. Cannot perform pop");
                }else {
                	System.out.println("The number you popped is : "+s.pop());
                }
                break;
        	case 3:
        		 if(s.size()==0)
                 {
                 	System.out.println("Stack Underflow. Cannot perform peek");
                 }else {
                 	System.out.println("The number you popped is : "+s.peek());
                 }
        	case 4:
        		System.out.println("The Size of the stack is: "+s.size());
        		break;
        	case 5:
        		System.exit(0);
        	default:
        		System.out.println("Invalid choice");
        	}
        }while(true);
	}

}

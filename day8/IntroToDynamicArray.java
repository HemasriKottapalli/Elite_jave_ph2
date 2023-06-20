package com.day8;

import java.util.Scanner;

public class IntroToDynamicArray {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int var;
		int pos;
		DynamicArray list = new DynamicArray();
		while(true) {
			System.out.println("-----------------list menu------------------");
			System.out.println("1.insert at end");
			System.out.println("2. display the list");
			System.out.println("3.inserta at specific pos");
			System.out.println("4.delete the specific pos");
			System.out.println("5.delete at end");
			System.out.println("6.delete at beginig");
			System.out.println("7.insert at begining");
			System.out.println("8.get value by index");
			System.out.println("9.update by index and new value");
			System.out.println("10.search element using value");
			System.out.println("11.to check weather elemnt present in list or not");
			System.out.println("12.clear the list");
			System.out.println("13.exit");
			System.out.println("select choice :");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter the size: ");
				var = sc.nextInt();
				list.insertAtEnd(var);
				break;
				}
			case 2:{
				list.display();
				break;
				}
			case 3:{
				System.out.println("enter the posirtion (starts from 0):");
				pos = sc.nextInt();
				if(pos<0) {
					System.out.println("invalid position");
					break;}
				System.out.println("Enter the data :");
				var = sc.nextInt();
				list.insertAtPos(pos,var);
				break;
				}
			case 4:{
				System.out.println("enter position (Starts from 0");
				pos=sc.nextInt();
				if(pos<0) {
					System.out.println("invalid position");
					break;
				}
				list.deleteAtPos(pos);
				break;
				}
			case 5:{
				list.deleteAtEnd();
				break;
			}
			case 6:{
				list.deleteAtBeg();
				break;
			}
			case 7:{
				System.out.println("enter the element");
				var=sc.nextInt();
				list.insertAtBeg(var);
				break;
			}
			case 8:{
				System.out.println("enter value");
				var = sc.nextInt();
				list.getvalues(var);
				break;
			}
			case 9:
			{
				System.out.println("enter the index to update :");
				pos=sc.nextInt();
				System.out.println("enter value:");
				var = sc.nextInt();
				list.updates(pos,var);
				break;
			}
			case 10:{
				System.out.println("enter value to search:");
				var = sc.nextInt();
				list.search(var);
				break;
//				contains;
//				clear;
			}
			case 11:{
				System.out.println("enter element to check: ");
				var = sc.nextInt();
				list.contains(var);
				break;
			}
			case 12:{
				list.clear();
				break;
			}
			case 13:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("invalid choice");
			}
			System.out.print("array size is ");
			list.size();
		}
}
}
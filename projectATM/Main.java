package com.projectATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       System.out.println("Welcome! Insert your card!");
	       while(true)
	       {
	    	   System.out.println("Enter 1-4;\n1.Deposit money\n2.Withdraw money\n3.Balance enquiery\n4.exit");
		       Scanner inp = new Scanner(System.in);
		       int choice = inp.nextInt();
		       switch(choice)
		       {
		        case 1:
		        	System.out.println("Enter the money to deposit: ");
		        	int money = inp.nextInt(); 
		        	DepositMoney dp= new DepositMoney(money);
		        	System.out.println("Deposited Successfully!");
		        	break;
		        case 2:
		        	System.out.println("Enter the money to withdraw: ");
		        	int amount = inp.nextInt(); 
		        	DrawMoney dr= new DrawMoney();
		        	int x = dr.canDraw(amount);
		        	if(x==1)
		        	{
		        		dr.draw(amount);
		        		System.out.println("Transaction Successfull! Here's your "+amount+" rupees");
		        		System.out.println();
		        	}
		        	else if(x==0){
		        		System.out.println("Your balance is way too less than the amount you want to withdraw! i am sorry but you're pooor!");
		        		System.out.println();
		        	}
		        	break;
		        case 3:
		        	int a= DepositMoney.getBalance();
		        	System.out.println("Total Balance: "+a);
		        	System.out.println();
		        	break;
		        case 4:
		        	System.out.println("Thanks for visiting!");
		        	System.exit(0);
		        default:
		        	System.out.println("Choice Invalid");
		       }
	       }
	}

}

package com.projectATM;

public class DrawMoney {
	
       int balance = DepositMoney.getBalance();
       public int canDraw(int amount)
       {
    	   if(amount<=balance)
    	   {
    		   return 1;
    	   }
    	   else {
    		   return 0;
    	   }
       }
       void draw(int amount)
       {
    	   balance = balance-amount;
    	   DepositMoney.setBalance(balance);
       }
}

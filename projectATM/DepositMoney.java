package com.projectATM;

public class DepositMoney {
	  int amount =0;
	  static int balance =5000;
      public DepositMoney(int money)
      {
    	  amount=money;
    	  updateBalance(amount);
      }
      
	  void updateBalance(int amount)
      {
    	  balance+=amount;
      }
      public static int getBalance() {
    	  return balance;
      }
      public static void setBalance(int amount)
      {
    	  balance=amount;
      }
}

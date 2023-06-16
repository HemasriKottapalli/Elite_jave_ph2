package com.day6;

class Book extends Thread{
	public void run() {
		for(int i=1; i<=5; i++)
		{
			System.out.println("db is updated");
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class multiThreading {

	public static void main(String[] args) {
		Book book = new Book();
		book.start();
		//book.updatedb();
		System.out.println("Hello");

	}

}

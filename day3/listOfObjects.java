package com.day3;

import java.util.ArrayList;
import java.util.List;

class Book{
	//attributes
	int id;
	String name;
	String author;
	//constructor
	Book(int id, String name, String author)
	{
		this.id=id;
		this.name=name;
		this.author=author;
	}
}
public class listOfObjects {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		Book b1 = new Book(123,"Fast&Furious","David Goggins");
		Book b2 = new Book(124,"Atomic Habits","Hema");
		Book b3 = new Book(125,"Lazy Life","Daisy Pranathi");
		books.add(b1);
		books.add(b2);
		books.add(b3);
		//printing
		for(Book x : books)
		{
			System.out.println("Id: "+x.id+" Name: "+x.name+" Author: "+x.author);
		}

	}

}

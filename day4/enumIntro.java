package com.day4;
enum Level{
	Low,
	Medium,
	High;
}
public class enumIntro {

	public static void main(String[] args) {
		//enums are used to store constant values
		// such as days,months,seasons etc
		//enum is a class
		Level l = Level.Low;
		System.out.println(l);
		for(Level x : Level.values())
		{
			System.out.println(x);
		}
		//other methods
		//valueOf()
		//ordinal()
	}

}

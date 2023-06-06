package com.day2;
public class Denomination {

	public static void main(String[] args) {
		 int amount = 1752;
		 int fhundreds= amount/500;
		 int remains = amount%500;
		 int thundreds = remains/200;
		 remains=remains%200;
		 int hundreds = remains/100;
		 remains=remains%100;
		 int fifties = remains/50;
		 remains=remains%50;
		 int twenties = remains/20;
		 remains=remains%20;
		 int tens = remains/10;
		 remains=remains%10;
		 int fives =remains/5;
		 remains=remains%5;
		 int twos = remains/2;
		 remains=remains%2;
		 System.out.println("No.of five hundreds = "+fhundreds);
		 System.out.println("No.of two hundreds = "+thundreds);
		 System.out.println("No.of one hundreds = "+hundreds);
		 System.out.println("No.of fifty rupees = "+fifties);
		 System.out.println("No.of twenty rupees = "+twenties);
		 System.out.println("No.of ten rupees = "+tens);
		 System.out.println("No.of five rupees = "+fives);
		 System.out.println("No.of two rupees = "+twos);
		 System.out.println("No.of one rupees = "+remains);
	}

}

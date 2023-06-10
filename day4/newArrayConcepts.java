package com.day4;

import java.util.Scanner;

public class newArrayConcepts {

	public static void main(String[] args) {
		System.out.println(Math.sqrt(0));
		//jagged array:
		//no.of elements in each row isn.t same
		//{{1,2,3,4},{3,4,5},{8,9}}
		Scanner inp = new Scanner(System.in);
		int[][] arr= new int[3][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[5];
		//taking input for jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			    System.out.println("enter the value for arr["+i+"]["+j+"]:");
				arr[i][j]=inp.nextInt();
			}
		}
		//printing multidimensional array with nested for each loop
		for(int[] x: arr)
		{
			for(int i:x)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

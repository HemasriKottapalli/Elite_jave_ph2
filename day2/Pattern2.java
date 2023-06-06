package com.day2;

public class Pattern2 {

	public static void main(String[] args) {
				int n=5;
				for(int row=1; row<=n; row++)
				{
					for(int col=1; col<=row; col++)
					{
						if(col==1 || col==row)
						{
							System.out.print(1+" ");
						}
						else {
							System.out.print((row-1)+" ");
						}
					}
					System.out.println();
				}

			}

		}


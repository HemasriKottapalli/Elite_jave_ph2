package com.day10;

public class InsertionSort {
	public static void display(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		 System.out.println();
	}
    public static void insertionSort(int[] arr)
    {
    	for(int i=1; i<arr.length; i++)
    	{
    		int key = arr[i];
    		int j=i-1;
    		while(j>0 && arr[j]>key)
    		{
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=key;
    	}
    }
	public static void main(String[] args) {
		int arr[] = {1,4,6,3,6};
		display(arr);
		insertionSort(arr);
		display(arr);

	}

}

package com.day10;

public class SelectiononSort {
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		 System.out.println();
	}
	static void swap(int i , int j, int[] arr)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
    public static void selectSort(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    	{
    		int min = arr[i];
    		int minIndex=i;
    		for(int j=i+1;j<arr.length; j++)
    		{
    			if(arr[j]<min)
    			{
    				min=arr[j];
    				minIndex=j;
    			}
    		}
    		swap(i,minIndex,arr);
    	}
    }
	public static void main(String[] args) {
		int arr[] = {1,4,5,68,3};
		display(arr);
		selectSort(arr);
		display(arr);
	}

}

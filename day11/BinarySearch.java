package com.day11;
public class BinarySearch {
	public static int search(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		boolean asc=true;
		if(arr[start]>arr[end]) {asc=false;}
		while(start<=end) {
			int mid=(start+end)/2;
			if(asc) {
			if(target>arr[mid]) {
				start=mid+1;
			}else if(target<arr[mid]) {
				end=mid-1;
			}else {
				return mid;
			}
		}else{
			if(target<arr[mid]) {
				start=mid+1;
			}else if(target>arr[mid]) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
		int arr[]= {2,5,6,7,8,9,10};int target=8;
		int arr1[]= {10,9,8,7,6,5,2};
		System.out.println(bs.search(arr,target));
		System.out.println(bs.search(arr1,target));

	}

}
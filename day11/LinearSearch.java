package com.day11;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {4,8,6,3,7,2,9};
		System.out.println(find(arr,7));
		System.out.println(contains(arr,11));
		String name = "k_k_kasyap";
		System.out.println(find(name,'a'));
		System.out.println(contains(name,'a'));

	}
	public static boolean contains(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean contains(String name, char target) {
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}

	public static int find(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int find(String name, char target) {
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==target) {
				return i;
			}
		}
		return -1;

	}

}

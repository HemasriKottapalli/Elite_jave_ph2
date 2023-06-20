package com.day8;
import java.util.Arrays;

public class DynamicArray {
	static int initialcap =8;//static data cant change
	//univarsal variables
	int cap;
	int arr[];
	int size;
	DynamicArray(){//constructor
		arr = new int[initialcap];
		size =0;
		cap = initialcap;
	}
	public void insertAtEnd(int var) {
		if(size==cap){
			ExpandArray();
		}
			arr[size++]=var;
	}
	public void ExpandArray() {
		cap = cap*2;
		arr=Arrays.copyOf(arr,cap);
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	public void insertAtPos(int pos,int var) {
		if(size==cap) {
			ExpandArray();
		}
		for(int i=size-1;i>=pos;i--) {
			arr[i+1]=arr[i];
		}
		arr[pos]=var;
		size++;
	}
	public void deleteAtPos(int pos) {
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(cap>3*size && cap>initialcap) {
			shrinkArray();
		}
	}
	public void shrinkArray() {
		// TODO Auto-generated method stub
		cap = cap/2;
		arr=Arrays.copyOf(arr, cap);
	}
	public void size() {
		System.out.println(arr.length);
	}
	public void deleteAtEnd() {
		size--;
	}
	public void deleteAtBeg() {
		for(int i=1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		if(cap>3*size && cap>initialcap) {
			shrinkArray();
		}
	}
	public void insertAtBeg(int var) {
		for(int i=size-1;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=var;
		size++;
	}
	public void getvalues(int var) {
		for(int i=0;i<size;i++) {
			if(var==arr[i]) {
				System.out.println("index is:"+i);
				break;
			}
		}
	}
	public void updates(int pos, int var) {
		arr[pos]=var;
	}
	public void search(int var) {
		for(int i=0;i<size;i++) {
			if(arr[i]==var) {
				System.out.println("found element at "+i+"index");
				break;
			}
		}
	}
	public void contains(int var) {
		for(int i=0;i<size;i++) {
			if(arr[i]==var) {
				System.out.println(var+"contains in list");
				break;
			}
		}
	}
	public void clear() {
		size=0;
	}
	//executed by Array
	
	
	
}
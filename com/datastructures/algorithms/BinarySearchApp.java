package com.datastructures.algorithms;

public class BinarySearchApp {
	
	private long[] sortedList;
	private int nElems;
	
	BinarySearchApp(int size) {
		sortedList = new long[size];
		nElems = 0;
	}
	
	void insert(long num) {
		sortedList[nElems++] = num;
	}
	void display() {
		System.out.print("List of elements:");
		for(int i=0;i<nElems;i++) 
			System.out.print(sortedList[i] + " ");
	}
	
	int binarySearch(long num, int low, int high) {
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(sortedList[mid] < num) {
				low = mid+1;
			} else if(sortedList[mid] > num) {
				high = mid-1;
			} else if(sortedList[mid] == num) {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		BinarySearchApp bsApp = new BinarySearchApp(15);
		
		bsApp.insert(10);
		bsApp.insert(20);
		bsApp.insert(30);
		bsApp.insert(40);
		bsApp.insert(50);
		bsApp.insert(60);
		bsApp.insert(70);
		bsApp.insert(80);
		bsApp.insert(90);
		bsApp.insert(100);
		
		bsApp.display();
		
		int found = bsApp.binarySearch(80, 0, bsApp.nElems-1);
		if(found > -1 ) 
			System.out.print("\nSearch key found at index : "+ found);
		else 
			System.out.print("\nSearch Key Not found");
	}
	
}

package tech.nkyd.dsalgo;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr1 = { 10, 9, 8, 7, 6 };
		System.out.println("insertion sorting:");
		print(arr1);
		insertionSort(arr1);
		print(arr1);
	}
	// iterates each element of array from second element to n element, considering first element as already sorted.
	static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			// lets consider this element name as insertionsortindexelement and index as insertionsortindex.
			insert(array, i);
			// time complexity (worst case)
			// O(n2)
			
			// time complexity (best case) - sorted array
			// O(n)
			
			//space complexity 
			//O(1)
			
		}
	}
	// passing the insertionsortindex of array, so we put this insertionsortindexelement in right place, so that all elements to the left of this insertionsortindex are sorted.
	static void insert(int[] array, int x) {
		// assign insertionsortindexelement to temp
		int temp = array[x];
		int i;
		// decrementing counter till the second element index 
		
		
		for (i = x; i > 0; i--) {
			//check insertionsortindexelement with each element on left part of the subarray
			if (temp < array[i - 1]) {
				// if insertionsortindexelement is less, move element to right
				// it means, we are trying to find the right location for the insertionsortindexelement
				array[i] = array[i - 1];
			} else {
				break;
			}
		}
		// once the loop is completed, we found the right location to place insertionsortindexelement
		array[i] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

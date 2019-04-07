package tech.nkyd.dsalgo;
/**
 * Learning this from below sites,
 * https://www.programiz.com/dsa/bubble-sort
 * https://www.studytonight.com/data-structures/bubble-sort
 * bubble sort - compare next element till end of the array
 */
public class BubbleSort {

	public static void main(String args[]) {
		int[] arr1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("bubble sorting:");
		print(arr1);
		bubbleSort(arr1);
		int[]  arr2 = { 1, 2, 3, 4, 5};
		print(arr2);
		optimizedBubbleSort(arr2);
	}

	static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("\niteration " + (i + 1));

			for (int j = 0; j < array.length - (i + 1); j++) {
				System.out.println("compare arr["+ j + "] - arr[" + (j + 1)+"]");
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
				
				
			}
			System.out.print("result:");
			print(array);
			// time complexity (worst case)
			// first pass takes n-1 comparisons where n is size of array
			// second pass takes n-2 comparisons and so on...
			// (n-1) + (n-2) + ....+ 3 + 2 + 1 comparisons
			
			// we know that 1 + 2 + 3 + ... + (n-1) + n = (n * (n+1)) / 2
			// so replacing n with (n-1) for above formula
			// total comparisons are ((n-1)) * ((n-1) + 1) / 2 = n * (n-1) / 2
			// ---> time complexity is O(n2)
			
			// space complexity 
			// for temp variable alone memory is spent
			// ---> space complexity is O(1)
		}
	}
	static void optimizedBubbleSort(int[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("\niteration " + (i + 1));

			for (int j = 0; j < array.length - (i + 1); j++) {
				System.out.println("compare arr["+ j + "] - arr[" + (j + 1)+"]");
				if(array[j]>array[j+1]) {
					swap(array, j, j+1);
					flag = true;
				}
			}
			
			System.out.print("result:");
			print(array);
			// time complexity (best case)
			// first pass takes n-1 comparisons where n is size of array
			// total comparisons are n
			// ---> time complexity is O(n)
			if(!flag) {
				break;
			}
		}
	}
	static void swap(int[] array, int x, int y) {
		int temp = array [x];
		array[x] = array[y];
		array[y] = temp;
	}
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
}

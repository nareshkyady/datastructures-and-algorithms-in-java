package com.algorithms;

public class BubbleSortApp {
	private long[] team; // numbered team array
	private int nElems; // num of elements

	BubbleSortApp(int size) {
		team = new long[size];
		nElems = 0;
	}

	void insert(long num) {
		team[nElems++] = num;
	}

	void bubbleSort() {
		for (int i = nElems; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (team[j] > team[j + 1]) {
					sort(j, j + 1);
				}
			}
		}
	}

	void sort(int a, int b) {
		long temp = team[a];
		team[a] = team[b];
		team[b] = temp;
	}

	void display() {
		System.out.print("Array:");
		for (int i = 0; i < nElems; i++) {
			System.out.print(team[i] + " ");
		}
		System.out.print("\n");
	}

	public static void main(String args[]) {
		BubbleSortApp bsApp = new BubbleSortApp(15);
		bsApp.insert(50);
		bsApp.insert(13);
		bsApp.insert(15);
		bsApp.insert(25);
		bsApp.insert(17);
		bsApp.insert(55);
		bsApp.insert(35);
		bsApp.insert(42);
		bsApp.insert(62);

		System.out.print("Unsorted ");
		bsApp.display();

		bsApp.bubbleSort();
		System.out.print("Sorted ");
		bsApp.display();
	}
}

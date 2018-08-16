package com.datastructures;
/**
 * This class is representation of single link/node with iData as "Data" and "next" as reference to next node/link.
 *
 */
public class Link {
	// iData holds the data in Node
	public int iData;
	// next holds the reference to next node/link in linked list.
	public Link next;
	
	public Link(int data) {
		iData = data;
		next = null;
	}
	void displayLink() {
		System.out.print(" {"+ iData +"} -> ");
	}
}

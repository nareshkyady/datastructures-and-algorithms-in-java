package com.datastructures;
public class Link {
	public int iData;
	public Link next;
	public Link(int data) {
		iData = data;
		next = null;
	}
	void displayLink() {
		System.out.print(" {"+ iData +"} -> ");
	}
}

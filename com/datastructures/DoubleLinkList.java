package com.datastructures;

public class DoubleLinkList {
	private DoubleLink first;
	private DoubleLink last;
	
	public DoubleLinkList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(int data) {
		DoubleLink newLink = new DoubleLink(data);
		if(first == null) {
			last = newLink;
		} else {
			first.prev = newLink;
		}
		newLink.next = first;
		first = newLink;
	}
	
	public void insertLast(int data) {
		DoubleLink newLink = new DoubleLink(data);
		if(first == null) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.prev = last;
		}
		last = newLink;
	}
	
	public void display() {
		DoubleLink current = first;
		System.out.print("FIRST <-> ");
		while(current !=null) {
			current.displayLink();
			current = current.next;
		}
		System.out.print("NULL");
	}
}

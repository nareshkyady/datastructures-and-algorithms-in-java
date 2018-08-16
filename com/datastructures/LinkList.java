package com.datastructures;

public class LinkList {
	private Link first;
	public LinkList() {
		first = null;
	}
	public void insert(int data) {
		Link newLink = new Link(data);
		Link temp = first;
		Link prev = first;
		// if no items in linklist
		if(first == null) {
			first = newLink;
		} else {
			while(temp !=null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = newLink;
		}
		// Time Complexity: O(n)
	}
	public Link find(int key) {
		Link current = first;
		while(current.iData != key) {
			if(current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}
	public Link delete(int data) {
		Link prev = first;
		Link current = first;
		while(current.iData != data) {
			if(current.next == null) {
				return null;
			} else {
				prev = current;
				current = current.next;
			}
		}
		if(current == first) {
			first = first.next;
		} else {
			prev.next = current.next;
		}
		return current;
	}
	public void display() {
		Link current = first;
		while(current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("NULL");
	}
	/*
	 * Find the middle node in a linkedlist. 
	 */
	public Link findTheMiddle() {
		Link fastPtr = first;
		Link slowPtr = first;
		while(fastPtr != null && fastPtr.next != null && fastPtr.next.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr;
	}
}

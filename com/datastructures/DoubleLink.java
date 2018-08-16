package com.datastructures;

public class DoubleLink {
	public int iData;
	public DoubleLink next;
	public DoubleLink prev;
	
	public DoubleLink(int data) {
		iData = data;
	}
	public void displayLink() {
		System.out.print("{" +iData + "} <-> ");
	}
}

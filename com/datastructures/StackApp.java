package com.datastructures;

public class StackApp {
	
	public static void main(String args[]) {
		Stack stack = new Stack(15);
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(40);
		stack.display();
		stack.push(50);
		stack.display();
		stack.push(60);
		stack.display();
		stack.push(70);
		stack.display();
		stack.push(80);
		stack.display();
		stack.push(90);
		
		stack.display();
		
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		
		
		stack.display();
		
		stack.push(90);
		
		stack.display();
	}

}
class Stack {
	private long[] stackArray;
	private int front;
	Stack(int size) {
		stackArray = new long[size];
		front = 0;
	}
	void push(long num) {
		stackArray[front++] = num;
	}
	long pop() {
		return stackArray[--front];
	}
	void display() {
		System.out.print("Stack:");
		for(int i=0;i<front;i++) {
			System.out.print(stackArray[i]+" ");
		}
		System.out.print("\n");
	}
}

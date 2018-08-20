package com.datastructures;

public class LinkListApp {
	public static void main(String argsp[]) {
		LinkList list = new LinkList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.insert(70);
		list.insert(80);
		list.insert(90);
		list.insert(100);
		list.insert(110);
		list.insert(120);

		list.display();

		System.out.println("Middle node:" + list.findTheMiddle().iData);
	}

}

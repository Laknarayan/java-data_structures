package com.samples.one;

public class LinkedNode2 {

	private int data;
	
	private LinkedNode2 next;
	
	private LinkedNode2 []list = new LinkedNode2[5];
	
	private int i = 0;
	
	public LinkedNode2(int data,LinkedNode2 next) {
		this.data = data;
		this.next = next;
	}
	
	public void addtoList(int index,LinkedNode2 node) {
		this.list[index] = node;
	}
	
	public LinkedNode2 printList(LinkedNode2 node) {
		System.out.println(node.data);
		return printList(node.next);
	}
	
	public static void main(String[] args) {

		LinkedNode2 linkedNode = new LinkedNode2(0, null);
		
		LinkedNode2 linkedNode1	= new LinkedNode2(10, null);
		LinkedNode2 linkedNode2	= new LinkedNode2(20, null);
		LinkedNode2 linkedNode3	= new LinkedNode2(30, null);
		LinkedNode2 linkedNode4	= new LinkedNode2(40, null);
		LinkedNode2 linkedNode5	= new LinkedNode2(50, null);
		
		linkedNode1.next = linkedNode2;
		linkedNode2.next = linkedNode3;
		linkedNode3.next = linkedNode4;
		linkedNode4.next = linkedNode5;
		
		linkedNode.next = linkedNode1;
		
//		linkedNode.addtoList(0, linkedNode1);
//		linkedNode.addtoList(1, linkedNode2);
//		linkedNode.addtoList(2, linkedNode3);
//		linkedNode.addtoList(3, linkedNode4);
//		linkedNode.addtoList(4, linkedNode5);
		
		linkedNode.printList(linkedNode.next);
	}

}

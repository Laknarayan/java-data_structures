package com.samples.one;

public class SumOf2LinkedList {

	public SumOf2LinkedList() {
	}
	
	public void init() {
		
	}
	public static void main(String[] args) {

		LinkedNode e1 = new LinkedNode(2);
		LinkedNode e2 = new LinkedNode(4);
		LinkedNode e3 = new LinkedNode(3);

		LinkedNode f1 = new LinkedNode(5);
		LinkedNode f2 = new LinkedNode(6);
		LinkedNode f3 = new LinkedNode(4);
		
		LinkedNode result1 = new LinkedNode(0);
		LinkedNode result2 = new LinkedNode(0);
		LinkedNode result3 = new LinkedNode(0);
		
		e1.setNext(e2);
		e2.setNext(e3);
		
		f1.setNext(f2);
		f2.setNext(f3);
		
		result1.setData(e1.getData() + f1.getData());
		result1.setNext(result2);
		result2.setData(e2.getData() + f2.getData());
		result2.setNext(result3);
		result3.setData(e3.getData() + f3.getData());
		
		printAllNodes(e1);
		printAllNodes(f1);
		printAllNodes(result1);

	}

	private static void printAllNodes(LinkedNode result1) {
		
		if( result1 != null ) {
		System.out.println(result1.getData());
		printAllNodes(result1.getNext());
		}
	}

}

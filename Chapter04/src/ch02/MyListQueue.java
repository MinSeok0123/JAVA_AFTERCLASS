package ch02;

import ch01.MyLinkedList;
import ch01.MyListNode;

public class MyListQueue extends MyLinkedList implements IQueue{

	private MyListNode front, rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData());
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return data;
	}

	@Override
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return ;
		}
		MyListNode temp = front;
		while(temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

}
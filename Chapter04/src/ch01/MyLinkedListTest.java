package ch01;

public class MyLinkedListTest {
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		
		list.insertElement("D",1);
		list.insertElement("E",0);
		list.printAll();
		list.removeElement(1);
		
		list.printAll();
	}
}

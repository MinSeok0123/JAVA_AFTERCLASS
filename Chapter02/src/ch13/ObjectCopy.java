package ch13;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		library[0] = new Book("�ﱹ��1", "ħ����");
		library[1] = new Book("�ﱹ��2", "ħ����");
		library[2] = new Book("�ﱹ��3", "ħ����");
		library[3] = new Book("�ﱹ��4", "ħ����");
		library[4] = new Book("�ﱹ��5", "ħ����");
		
		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		System.out.println("=====copy library=====");
		for(Book book : copylibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("�����");
		library[0].setAuthor("�������丮");
		
		
		System.out.println("=====library=====");
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("=====copy library=====");
		
		for(Book book : copylibrary) {
			book.showBookInfo();
		}

	}

}

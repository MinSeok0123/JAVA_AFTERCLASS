package ch13;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
		
		library[0] = new Book("»ï±¹Áö1", "Ä§Âø¸Ç");
		library[1] = new Book("»ï±¹Áö2", "Ä§Âø¸Ç");
		library[2] = new Book("»ï±¹Áö3", "Ä§Âø¸Ç");
		library[3] = new Book("»ï±¹Áö4", "Ä§Âø¸Ç");
		library[4] = new Book("»ï±¹Áö5", "Ä§Âø¸Ç");
		
		System.arraycopy(library, 0, copylibrary, 0, 5);
		
		System.out.println("=====copy library=====");
		for(Book book : copylibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("¾î¸°¿ÕÀÚ");
		library[0].setAuthor("»ýÅØÁãÆä¸®");
		
		
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

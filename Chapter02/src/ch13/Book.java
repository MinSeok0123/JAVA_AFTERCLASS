package ch13;

public class Book {
	
	private static int number = 100;
	
	private String title;
	private String author;
	private int bookNumber;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.bookNumber = number++;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
		
	}
	
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Book.number = number;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}
	
	public void showBookInfo() {
		System.out.println(" 책 이름은 " + title + "이고 저자는 " + author + "이고 책번호는 " + bookNumber + "입니다");
	}

}

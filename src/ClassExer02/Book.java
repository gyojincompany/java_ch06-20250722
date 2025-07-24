package ClassExer02;

//1. 책의 이름과 가격을 필드로 가지는 Book 클래스를 만드시오. 
//단, 생성자에서 두 필드를 초기화 하도록 만들고, 책의 이름과 가격을 출력하는 printInfo 메서드를 포함하시오.

public class Book {
	
	String bookName;
	static int bookPrice = 10000;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void printInfo() {
		System.out.println("책 이름 : " + bookName);
		System.out.println("책 가격 : " + bookPrice + "원");
	}
	
	
}

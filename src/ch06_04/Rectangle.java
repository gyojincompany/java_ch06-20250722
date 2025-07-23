package ch06_04;

public class Rectangle {
	
	int width;
	int height;
	String color;
	
	// 생성자 오버로딩
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		
	}
	
	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	// 메소드 오버로딩
	public int rectArea() {
		return width * height;
	}
	
	public int rectArea(int width, int height) {
		return width * height;
	}
	
	public int rectArea(int width) {
		return width * this.height;
	}

}

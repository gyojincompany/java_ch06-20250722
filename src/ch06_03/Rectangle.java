package ch06_03;

public class Rectangle { // 사각형 클래스
	
	int width; // 사각형 가로길이
	int height; // 사각형 세로길이
	
//	public Rectangle() { // 기본 생성자(생략 가능) -> 반환타입이 아예 없고, 이름이 해당 클래스의 이름으로 고정
//		
//	}
//	
//	public Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
	public Rectangle() { // 기본 생성자
		
	}
	
	
	public Rectangle(int width, int height) {	
		this.width = width;
		this.height = height;
	}


	public int rectArea() { // 사각형 면적 반환 메소드
		return width * height;
	}

	

}

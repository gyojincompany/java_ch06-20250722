package ch06_01;

public class Triangle {
	
	// 삼각형의 추상화 -> 속성, 필드, 멤버변수
	int height;
	int width;
	String color;
	
	// 메소드
	// 삼각형 면적
	public double traingleArea() {
//		double area = height * width * 0.5;
//		return area;
		return height * width * 0.5;
	}
	
	// 삼각형의 color를 반환
	public String traingleColor() {
		System.out.println("삼각형의 색 : " + color);
		return color;
	}
	
	
}

package ch06_03_exer;

public class Circle {
	
	int radius; // 반지름
	double PI = 3.14; //파이값
	
	public Circle() { //기본생성자
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	//입력된 반지름을 가진 원의 면적을 반환하는 메소드 circleArea
	public double circleArea() {
		return radius * radius * PI;
	}
	
	
	
	
	

}

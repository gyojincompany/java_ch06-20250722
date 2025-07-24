package ClassExer02;

//5. 사각형의 가로와 세로 길이를 입력받아 사각형의 둘레를 출력하는 Rectangle 클래스를 만드시오. 
//단, 생성자에서 가로와 세로를 입력 받고 가로와 세로 길이는 정수와 실수 모두 입력받을 수 있도록 생성하시오.(생성자 오버로딩)


public class Rectangle {
	
	double width;
	double height;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public void recRound() {
		double round = (this.width + this.height) * 2;
		System.out.println("사각형의 둘레 : " + round);
	}
	
	
	
	
}

package ch06_01;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle tri1 = new Triangle(); // 객체 선언 -> 인스턴스 생성
		tri1.height = 20;
		tri1.width = 10;
		tri1.color = "red";
		
		double tri1area = tri1.traingleArea(); // 메소드 호출
		System.out.println(tri1area);
		
		String tri1color = tri1.traingleColor(); // method call -> 메소드 호출
		
		System.out.println(tri1.height * tri1.width *0.5);
		
		Triangle tri2; // 객체 선언 -> 메모리에 객체가 만들어지지는 않은 상태
		tri2 = new Triangle(); // 인스턴스화 -> 메모리에 객체(인스턴스)가 만들어짐
		
	}

}

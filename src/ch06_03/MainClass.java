package ch06_03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 가로 10 세로 20 -> 면적 출력
		Rectangle rec1 = new Rectangle(); // 기본 생성자 호출
		// 객체 선언 -> 생성자 호출
		rec1.width = 10;
		rec1.height = 20;
		int rec1Area = rec1.rectArea();
		System.out.println(rec1Area);
		
		Rectangle rec2 = new Rectangle(100, 200);

	}

}

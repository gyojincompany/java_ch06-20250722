package ch06_06;

public class Tire {
	String tireName;
	int tirePrice;
	
	public void tirePrint() { //protected -> 같은 패키지내에서만 접근 가능한 메소드로 지정
		System.out.println("타이어!!");
	}
}

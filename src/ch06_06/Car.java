package ch06_06;

import ch06_06_01.AutoCar;

public class Car {	
	public static void main() {
		AutoCar autoCar = new AutoCar(); // 다른 패키지->import문 반드시 필요!
		Tire tire = new Tire(); // 같은 패키지
		tire.tireName = "금호";
		tire.tirePrice = 100000;
		tire.tirePrint();
	}
	
	
}

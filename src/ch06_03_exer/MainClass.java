package ch06_03_exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		
		System.out.println("원의 면적:" + circle.circleArea());
		
		System.out.println("================================");
		
		Calculator calculator = new Calculator(20, 10);
		calculator.add();
		calculator.minus();
		calculator.mul();
		calculator.divid();
		calculator.square(); //제곱연산
		
		System.out.println("================================");
		
		Engine engine = new Engine("가솔린", 2);
		
		Car car = new Car("소나타", 200, engine);
		
		car.carEngineType();
	}

}

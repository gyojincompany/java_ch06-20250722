package ch06_03_exer;

public class Car {
	String name;
	int maxspeed;
	
	Engine engine; // Engine 클래스로 만든 객체를 필드(멤버 변수)로 선언

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, int maxspeed, Engine engine) {
		super();
		this.name = name;
		this.maxspeed = maxspeed;
		this.engine = engine;
	}
	
	public void carEngineType() {
		System.out.println("엔진타입:" + engine.type);
		engine.printEngine();
	}
	
	public Engine outputEngine() {
		engine.type = "디젤";
		engine.displacement = 2;
		return engine;
	}
	
	public String[] outputCars() {
		String[] cars = {"소나타","아반떼","K5"};
		
		carEngineType();
		
		return cars; // 배열
	}
	
	
}

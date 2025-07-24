package ch06_05;

public class SingleTonTest { // 메모리에 반드시 하나만 존재하여야 하는 인스턴스를 만들어주는 클래스
	
	int a;
	String b;
	
	private static SingleTonTest singleTonTest = new SingleTonTest(); //정적 멤버(필드)

	private SingleTonTest() {

	}
	
	public static SingleTonTest getInstance() {
		return singleTonTest;
	}
	
	

}

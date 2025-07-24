package ch06_05;

import ch06_01.*;


public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SingleTonTest single1 = new SingleTonTest();
//		SingleTonTest single2 = new SingleTonTest();
//		SingleTonTest single3 = new SingleTonTest();
//		single1.getInstance();
		
		SingleTonTest single1 = SingleTonTest.getInstance(); // return SingleTontest객체를 반환		
		SingleTonTest single2 = SingleTonTest.getInstance();
		SingleTonTest single3 = SingleTonTest.getInstance();
		
		if(single1 == single2) {
			System.out.println("같은 객체를 참조하고 있습니다!");
		} else {
			System.out.println("다른 객체를 참조하고 있습니다!");
		}
		
		final int scr = 400; // 상수 400으로 고정
//		scr = 1000; // scr이 final로 인해 값을 변경할 수 없는 변수가 되어 에러 발생!
		
		//Triangle
		//Student
//		School
		
	}

}

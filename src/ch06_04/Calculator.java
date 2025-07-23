package ch06_04;

public class Calculator {
	
	public int add(int num1, int num2) { //덧셈 메소드
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public int total(int[] numbers) {
		int total = 0;
		for(int num:numbers) {
			total = total + num;
		}
		return total;
	}
	
	public int total2(int ...numbers) {
		int total = 0;
		for(int num:numbers) {
			total = total + num;
		}
		return total;
	}
	
	
	
	
	
	
}

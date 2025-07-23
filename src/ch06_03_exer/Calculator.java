package ch06_03_exer;

public class Calculator {
	int num1;
	int num2;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() { // 덧셈 연산
		System.out.println(this.num1 + this.num2);
	}
	
	public void minus() { // 뺄셈 연산
		System.out.println(this.num1 - this.num2);
	}
	
	public void mul() { // 곱셈 연산
		System.out.println(this.num1 * this.num2);
	}
	
	public void divid() { // 나눗셈 연산
		System.out.println(this.num1 / this.num2);
	}
	
	public void square() { // 제곱 연산
		System.out.println(this.num1 * this.num1);
		System.out.println(this.num2 * this.num2);
	}
	
	
	
	
}

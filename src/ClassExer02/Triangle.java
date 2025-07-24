package ClassExer02;

//6. 세변의 길이를 입력 받아 삼각형인지 아닌지 판별할 수 있는 Triangle 클래스를 만드시오. (생성자 or 메서드만 만듬)
//boolean isValid 메서드는 세변으로 삼각형인지 여부를 판별하는 메서드로 두 변 합 > 나머지 변 의 조건을 만족하면 true 로 출력하는 메서드로 만들어 생성하시오.

public class Triangle {
	
	public boolean isValid(int a, int b, int c) {
		boolean flag = (a + b) > c && (a + c) > b && (b + c) > a;
		return flag;		
	}
	
}

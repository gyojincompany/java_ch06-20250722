package ClassExer02;

//4. BMI 계산기 클래스를 만들려고 한다. (메서드만)
//BMI의 계산식은 BMI = weight / (height²) 이다. 
//키와 몸무게를 넣으면 BMI를 출력하는 bmiCalculator 메서드를 가지고 있는 BMI 계산기 클래스를 만드시오.


public class BMI {
	public void bmiCalculator(int weight, int height) {
		 double bmi = (double) weight / (height * height);
		 System.out.println("bmi : " + bmi);
	}
	
	public void bmiCalculator(double weight, double height) { //메소드 오버로딩
		 double bmi = weight / (height * height);
		 System.out.println("bmi : " + bmi);
	}
}

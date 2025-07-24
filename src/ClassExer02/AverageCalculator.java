package ClassExer02;

//3. 정수형 배열을 입력하면 배열의 모든 요소의 평균을 출력하는 getAverage 메서드를 가지고 있는 AverageCalculator 클래스를 만드시오.(메서드만)
//{10,20,30,40,50}
//평균:30


public class AverageCalculator {
	public void getAverage(int[] intArr) {
		
		int sum = 0;
		
		for(int num : intArr) {
			sum = sum + num;
		}
		
		double avgArr = sum / (double) intArr.length;
		System.out.println(avgArr);
	}
	
}

package ClassExer;

//3. Temperature 클래스 구현
//요구사항
//
//Temperature 클래스를 정의하세요.
//
//필드:
//
//double celsius
//
//double toFahrenheit() 메서드 작성:
//
//섭씨 온도를 화씨로 변환하여 반환
//
//변환 공식: 화씨 = 섭씨 * 1.8 + 32
//
//[실행 예시]
//
//화씨 온도: 77.0


public class Temperature {
	double celsius; //섭씨
	
	public double toFahrenheit() {
		double fahrenheit = this.celsius * 1.8 + 32;
		return fahrenheit;
	}
}

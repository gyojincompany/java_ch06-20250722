package ClassExer;

//2. Score 클래스 구현
//
//요구사항
//
//Score 클래스를 정의하세요.
//
//필드:
//
//int kor, int eng, int math
//
//printScore() 메서드 작성:
//
//총점, 평균을 출력
//
//평균이 90점 이상이면 "우수",
//60점 미만이면 "재시험",
//그 외는 "보통" 출력
//
//[실행 예시]
//
//총점: 270  
//평균: 90.0  
//우수


public class Score {
	int kor;
	int eng; 
	int math;
	
	public void printScore() {
		int total = this.kor + this.eng + this.math;
		double avg = total / 3.0;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		if(avg >= 90) {
			System.out.println("우수");
		} else if(avg < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
		
	}
}

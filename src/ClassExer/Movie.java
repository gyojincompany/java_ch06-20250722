package ClassExer;

//4. Movie 클래스 구현
//요구사항
//
//Movie 클래스를 정의하세요.
//
//필드:
//
//String title, String genre, int runtime
//
//boolean isLongMovie() 메서드 작성:
//
//상영 시간이 120분 이상이면 true, 아니면 false 반환
//
//main에서 결과 출력
//
//[실행 예시]
//
//긴 영화인가요? true

public class Movie {
	String title;
	String genre;
	int runtime;
	
//	public Movie() { // 기본 생성자
//		
//	}
//	
//	public Movie(String title, int runtime) { // 새로운 생성자 추가
//		this.title = title;		
//		this.runtime = runtime;
//	}
//	
//	public Movie(String title, String genre, int runtime) { // 새로운 생성자 추가
//		this.title = title;
//		this.genre = genre;
//		this.runtime = runtime;
//	}
	
	public Movie() { // 기본생성자
		
	}
	
	public Movie(String title, int runtime) {	
		this.title = title;
		this.runtime = runtime;
	}

	public Movie(String title, String genre, int runtime) {	
		this.title = title;
		this.genre = genre;
		this.runtime = runtime;
	}


	public boolean isLongMovie() {
		return runtime >= 120;
	}

	
}

package ClassExer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Product 클래스 호출
		Product product = new Product();
		
		product.name = "선풍기";
		product.price = 100000;
		product.quantity = 2;
		
		int totalPrice = product.getTotalPrice();
		System.out.println("총 가격: " + totalPrice);
		
		System.out.println("=============================");
		
		
		// Score 클래스 호출
		Score score = new Score();
		score.kor = 90;
		score.eng = 90;
		score.math = 90;
		
		score.printScore();
		
		System.out.println("=============================");
		
		
		// Temperature 클래스 호출
		Temperature temperature = new Temperature();
		temperature.celsius = 30;
		double fr = temperature.toFahrenheit();
		System.out.println("화씨 온도:" + fr);
		
		System.out.println("=============================");
		
		
		// Movie 클래스 호출
		Movie movie = new Movie();
		movie.title = "슈퍼맨";
		movie.genre = "SF";
		movie.runtime = 150;
		
		System.out.println("긴 영화인가요? " + movie.isLongMovie());
	}

}

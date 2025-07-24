package ClassExer02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book book = new Book("쥬라기공원", 20000);
//		book.printInfo();
//		book.bookName = "서유기";
		Book.bookPrice=20000;
		System.out.println(Book.bookPrice);		
		
		System.out.println("=============================");
		
		StringTool strTool = new StringTool() ;
		strTool.printLength("Korea");
		
		System.out.println("=============================");
		
		AverageCalculator avCalculator = new AverageCalculator();
		int[] scores = {10,20,30,40,50};
		avCalculator.getAverage(scores);
		
		System.out.println("=============================");
		
		BMI bmi = new BMI();
		bmi.bmiCalculator(70.5, 180.3);
		
		System.out.println("=============================");
		
		Rectangle rectangle = new Rectangle(10.5, 20.4);
		rectangle.recRound();
		
		System.out.println("=============================");
		
		Triangle triangle = new Triangle();
		System.out.println(triangle.isValid(10, 5, 8));
		
		Triangle triangle2 = new Triangle();
	}

}

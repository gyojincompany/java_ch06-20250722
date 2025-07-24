package ClassExer02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("쥬라기공원", 20000);
		book.printInfo();
		
		System.out.println("=============================");
		
		StringTool strTool = new StringTool() ;
		strTool.printLength("Korea");
		
		System.out.println("=============================");
		
		AverageCalculator avCalculator = new AverageCalculator();
		int[] scores = {10,20,30,40,50};
		avCalculator.getAverage(scores);
	}

}

package ch06_04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal1 = new Calculator();
		int result = cal1.add(20, 10);
		System.out.println(result);
		
		String str1 = new String("kor");
		String str2 = new String("kor");
//		
		if(str1.equals(str1)) { // String 클래스에서 설계되어 있는 메소드인 equeals 사용
			
		}		
		
		System.out.println(cal1.total(new int[] {10,20,30}));
		
		int[] arr1 = {10,20,30};
		System.out.println(cal1.total(arr1));
		
		System.out.println(cal1.total2(10,20,30));
		
	}

}

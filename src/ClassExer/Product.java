package ClassExer;

//1. Product 클래스를 구현 하시오.
//
//요구사항
//
//Product 클래스를 정의하세요.
//
//다음 필드를 포함합니다:
//
//String name (상품명)
//
//int price (가격)
//
//int quantity (수량)
//
//getTotalPrice() 메서드를 작성하여 총 가격(가격 × 수량)을 반환하세요.
//
//main 메서드에서 상품을 생성하고 총 가격을 출력하세요.
//
//[실행 예시]
//
//총 가격: 200000

public class Product {
	String name;
	int price;
	int quantity;
	
	public int getTotalPrice() {
		return price * quantity;
	}

}

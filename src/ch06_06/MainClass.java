package ch06_06;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		member.setName("홍길동");
		member.setId("tiger");
		member.setPw("12345");
		member.setAge(21);
		
		//System.out.println(member.name);
		// member.age = 40;
		System.out.println(member.getName());
		
		
//		member.name = "홍길동";
//		// member.id = "tiger"; ->필드인 id가 private 값을 넣을 수 없음!
//		member.setId("tiger");
//		
//		member.pw = "12345";
//		member.age = 21;
//		
//		member.age = 40;
		
		Member member2 = new Member("이순신", "lion", "12345", 27);
		// member2.age = 50;
	}

}

package ch06_06;

public class Member {
	private String name; //회원의 이름
	private String id; //회원의 아이디
	private String pw; //회원의 비밀번호
	private int age; //회원의 나이
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public void setId(String id) { //setter 메소드		
		this.id = id;		
	}
	
	public void setPw(String pw) { //setter 메소드		
		this.pw = pw;		
	}
	
	public void setAge(int age) { //setter 메소드		
		this.age = age;		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() { //getter 메소드
		return this.name;
	}
	
	
	
}
	


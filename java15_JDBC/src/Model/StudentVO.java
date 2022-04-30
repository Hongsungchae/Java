package Model;

public class StudentVO {
	//필드 : 학생번호, 이름, 나이, 전화번호, 이메일
	private int num;
	private String name;
	private int age;
	private String tel;
	private String email;
	//생성자
	public StudentVO(int num, String name, int age, String tel, String email) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getTel() {
		return tel;
	}
	public String getEmail() {
		return email;
	}
	
	//메서드
	
}

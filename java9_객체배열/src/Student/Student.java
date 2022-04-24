package Student;

public class Student {
	//속성(필드)
	private String name;
	private int ban;
	private int num;
	
	//기능(메서드) : getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//Override : 부모의 기능 재정의
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", num=" + num + "]";
	}
	
	
	
}

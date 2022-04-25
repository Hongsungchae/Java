package Person;

public class Student extends Person{
	
	String stdId = "123";
	String grade;
	
	public Student(String name) {
		super(name);
	}
	public void walk() {
		System.out.println("걸어서 학교간다");
	}
}

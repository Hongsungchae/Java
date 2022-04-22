package 생성자;

public class Personmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		Person person1 = new Person();
		person1.setName("홍길동");
		person1.setAge(25);
		
		Person person2 = new Person("김영희",27);
		
		System.out.println("st1객체 학생 이름 : "+person1.getName()+","
							+" 나이 : "+person1.getage());
		
		System.out.println("st2객체 학생 이름 : "+person2.getName()+","
				+" 나이 : "+person2.getage());		
		
		
		
	}

}

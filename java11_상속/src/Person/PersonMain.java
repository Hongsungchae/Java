package Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("김소원");
		
		System.out.println(s1.getName());
		System.out.println(s1.stdId);
		
		s1.walk();
		//업캐스팅 : 하위클래스의 객체를 상위클래스로 형변환(자동) 하는 것
		//업캐스팅이 되었을 때는 그 전 상태(하위클래스)의 객체 멤버에는 접근 X
		//단 오버라이딩된 경우에는 하위클래스의 메서드 호출 가능
		Person p = s1;
		
		p.walk();
		
		Student p1 = new Student("김헌찬");
		Teacher p2 = new Teacher("전채원");
		//서로 타입이 다르기 때문에 배열이나 리스트에 담을 수 X
		//Student, Teacher -> 모두 Person
		
		Person ps1 = p1;
		Person ps2 = p2;//업캐스팅된 경우
		
		Person p_arr[] = new Person[2];
		p_arr[0] = ps1;
		p_arr[1] = ps2;

		for(Person person:p_arr) {
			person.walk();
		}
		
		//업캐스팅 된 상태에서 원래 어떤 타입이었는지 알고 싶을 때 사용하는 연산자는
		//instanceof입니다. -> true/false 반환 
		System.out.println(ps1 instanceof Student);
		System.out.println(ps1 instanceof Teacher);
		
		//다운 캐스팅 : 업캐스팅된 객체를 원래 타입으로 다시 되돌리는 것
		//명시적 형변환해야됨
		Student p3 = (Student)ps1;
		System.out.println(p3.stdId);
	}

}

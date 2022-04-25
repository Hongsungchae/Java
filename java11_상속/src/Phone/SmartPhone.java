package Phone;

public class SmartPhone extends Phone{
	//필드(속성) : (스피커, 마이크)->Phone 클래스 , 카메라
	//메서드(기능) : (전화하다, 문자하다)->Phone, 인터넷하다.
	String camera;
	//SmartPhone이 생성이 될 때 speaker 필드 값을 초기화(LG);
	
	public SmartPhone() {
		super("LG");//슈퍼클래스의 생성자 호출
		//정의 안할 시 슈퍼클래스의 기본생성자호출
	}
	
	public void internet() {
		System.out.println("인터넷 접속");
	}
	public String getSpeaker() {
		//super:부모 멤버(필드, 메서드) 호출
		return super.getSpeaker();
	}
}

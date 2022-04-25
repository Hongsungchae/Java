package Phone;

public class FolderPhone {
	//필드(속성) : 스피커, 마이크
	//메서드(기능) : 전화하다, 문자하다, 접는다
	
	String speaker;
	boolean mic;
	
	public void call() {
		System.out.println("따르릉");
	}
	public void message() {
		System.out.println("문자!");
	}
	public void fold() {
		System.out.println("접는다!");
	}
	
}

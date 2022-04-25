package Phone;

public class Phone {
	//필드(속성) : 스피커, 마이크 
	//메서드(기능) : 전화하다, 문자하다
	
	private String speaker = "삼성";
	private boolean mic;
	
	public Phone(String speaker) {
		this.speaker = speaker;
	}
	
	public void call() {
		System.out.println("따르릉");
	}
	public void message() {
		System.out.println("문자!");
	}
	public String getSpeaker() {
		return speaker;
	}
}

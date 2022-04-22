package 예제1;

public class 춘식 {
//춘식이 캐릭터 설계
	//속성(field), 행동(method)
	//1. 속성 : 이름, 레벨, 공격력
	String name;
	int level;
	int power;
	
	//생성자 : new키워드 사용해서 객체를 생성할때만 호출되는 메서드
	//접근 제한자 클래스이름(){}
	//매개변수X, 기능X
	public 춘식() {
		
	}
	
	public 춘식(String name, int level, int power) {
		this.name = name;
		this.level = level;
		this.power = power;
		
	}
	
	//2. 메소드 : 공격한다, 걷는다, 
	public void attack() {
		System.out.println(name +"공격");
	}
	public void work() {
		System.out.println("걷는다");
	}
}

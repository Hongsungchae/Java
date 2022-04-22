package 예제1;

public class 춘식메인 {

	public static void main(String[] args) {
		new 춘식();
		
		춘식 cs = new 춘식();
		
		//현재 속성 출력
		
		//생선된 춘식 인스턴스의 레벨에 접근
		System.out.println(cs.level);
		cs.attack();
		
		cs.name = "내 춘식이";
		cs.level = 20;
		cs.power = 50;
		
		System.out.println("이름 : "+cs.name);
		System.out.println("레벨 : " +cs.level);
		System.out.println("공격력 : "+cs.power);
		
		춘식 cs2 = new 춘식("춘식2",10,50);
		
		cs2.attack();
	}
}

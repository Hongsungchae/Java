package EPoketmon;

public interface Epoketmon {//객체 생성 불가능
	//인터페이스 내에서는 상수만 선언 가능(final)
	//상수는 무조건 선언할 때 초기화 시켜줘야함
	final String type = "전기";
	
	int Level = 1;//상수
	//인터페이스 내에는 변수 선언이 불가능하기 때문에 final을 안붙여도
	//상수로 선언(초기화는 해야됨)
	
	//인터페이스 내에서는 추상메서드 선언가능
	public abstract void attact();
	public void moving();//추상으로 자동 적용
	
	//java8버전 이상부터는 일반메서드도 선언 가능
	//default, static이 붙어야 가능
	//default : 접근제한자가 아니라 인터페이스 내에서 일반 메서드를 선언할 수 있게 해주는 키워드
	public default void hello() {
		System.out.println("안녕");
	}
	public static void hello2() {
		System.out.println("안녕");
	}	
}

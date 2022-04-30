package Thread;

public class Ari2 implements Runnable{
	
private String skill;
	
	public Ari2(String key) {
		skill = key;
	}
	//쓰레드 클래스의 run()메소드를 오버라이딩(재정의)한 것
	//run() => 쓰레드 코드
	//쓰레드는 Run()메소드에서 부터 실행을 시작하고 Run() 종료되면 스레드도 종료
	//오버라이딩 하지않으면 Thread 클래스의 작성된 Run()을 호출하게 되며
	//이때 run()메소드는 아무일도 하지않고 스레드를 바로 종료
	public void run() {
		System.out.println("입력 키 : "+ skill);
		for(int i =1; i<=3; i++) {
			System.out.println(skill + "스킬 사용 중 : " + i+ "s");
		}
		System.out.println(skill + "사용 종료");
	}
	
}

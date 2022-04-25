package Animal;

public class Cat extends Animal{

	public void groom() {
		System.out.println("그루밍중");
	}
	
	@Override
	//오버라이딩할 때 오타 검출, 컴파일 할 때 오류를 확인할 수 있게
	public void cry() {
		System.out.println("미야옹!");
	}
}

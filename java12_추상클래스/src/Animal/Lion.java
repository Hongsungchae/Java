package Animal;

public class Lion extends Animal {

	boolean tail;
	@Override
	public void moving() {
		System.out.println("사자 움직임");
	}

	@Override
	public void attack() {
		System.out.println("사자공격");	
	}
	public void sleep() {
		System.out.println("사자 자다");
	}
	
	public void f() {
		System.out.println("!");
	}
}

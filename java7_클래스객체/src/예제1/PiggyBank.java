package 예제1;

public class PiggyBank {
	//현재 클래스(객체)내에서만 접근 가능하도록
	private int money ;
	
	public void deposit(int money) {
		this.money = this.money + money;
	}
	public void withdrow(int money) {
		if(this.money >= money)
			this.money -=money;
		else
			System.out.println("잔액 부족합니다. ");
	}
	public void showMoney() {
	System.out.println("현재 잔액 : "+money);
	}
}

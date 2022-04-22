package 예제1;

public class PiggyBankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PiggyBank pb = new PiggyBank();

		//priavte 접근제한자가 붙은필드는 바로 접근X
		//기능을 사용해서 값 변경해야됨
		//pb.money = 1000000;
		
		pb.deposit(1000);
		pb.showMoney();
		System.out.println("================");
		pb.withdrow(600);
		pb.showMoney();
		System.out.println("================");
		pb.withdrow(600);
		pb.showMoney();
	}

}

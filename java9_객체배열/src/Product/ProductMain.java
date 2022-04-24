package Product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 개수 입력 : ");
		int a = sc.nextInt();
		String name;
		int price;
		int amount;
		
		Product pro[];
		pro = new Product[a];
		
		for(int i = 0; i < a; i++) {
			System.out.print("1. 물건 이름 : ");
			name = sc.next();
			System.out.print("2.단가 : ");
			price = sc.nextInt();
			System.out.print("3. 수량 : ");
			amount = sc.nextInt();
			pro[i] = new Product(name,price,amount);
		}
		System.out.println("제품명     단가    수량");
		for(int j = 0; j<a; j++) {
			System.out.println(pro[j].getName()+"     "+ pro[j].getUnitPrice() + "     "+
		pro[j].getAmount());
			System.out.println("총 금액 : " + pro[j].getUnitPrice()*pro[j].getAmount());
		}
	}

}

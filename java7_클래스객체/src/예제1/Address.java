package 예제1;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		new AddressList();
		AddressList al = new AddressList();
		
		
		System.out.print("이름 : ");
		al.name = sc.next();
		System.out.print("주소 : ");
		al.address = sc.next();
		System.out.print("번호 : ");
		al.call = sc.next();
		
		al.shoaddr();
		
		AddressList al1 = new AddressList();
		System.out.print("이름 : ");
		al1.name = sc.next();
		System.out.print("주소 : ");
		al1.address = sc.next();
		System.out.print("번호 : ");
		al1.call = sc.next();
		
		al1.shoaddr();
		
	}

}

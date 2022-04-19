package 조건문;

import java.util.Scanner;

public class Ex07조건문_ifelse예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력하세요 : ");
		String data = sc.next();
		
		if("A".equals(data)) {
			System.out.println("A입력");
		}
		else if("B".equals(data)) {
			System.out.println("B입력");
		}
		else if("C".equals(data)){
			System.out.println("C입력");
		}
		else
			System.out.println("A,B,C 외 입력");
		
	}

}

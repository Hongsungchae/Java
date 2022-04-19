package 조건문;

import java.util.Scanner;

public class Ex08조건문_ifelse예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("잔액을 입력하세요 : ");
		int data = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String age = sc.next();

		if("성인".equals(age)) {
			if(data>=1800) {
				System.out.println("감사합니다.");
			}
		}
		else if("청소년".equals(age)) {
			if(data>=1500) {
				System.out.println("반갑습니다.");
			}
		}
		else if("어린이". equals(age)) {
			if(data>=1000) {
				System.out.println("안녕하세요.");
			}
		}
		else
			System.out.println("잔액부족입니다.");
	
	}

}

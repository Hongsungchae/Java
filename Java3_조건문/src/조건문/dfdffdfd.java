package 조건문;

import java.util.Scanner;

public class dfdffdfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int num = sc.nextInt();
		System.out.println("--메뉴-- ");
		System.out.println("1. 콜라(1800원)  2. 파워에이드(2000원)  3. 탄산수(1200원)");
		System.out.print("선택한 음료수 번호 : ");
		int num2 = sc.nextInt();
		
		int num3 = 0;//잔돈 넣을 변수
	
		//음료 선택, 금액 비교
		if(num2 == 1) { //콜라를 선택할 시
			System.out.println("콜라"); 
			if(num < 1800) { //금액 비교, 금액이 적을 시
				System.out.println("금액 부족");
			}
			num3 = num - 1800; //잔돈을 num3에 저장
		}
		else if(num2 == 2) { //파워에이드를 선택할 시
			System.out.println("파워에이드");
			if(num < 2000) { //금액 비교, 금액이 적을 시
				System.out.println("금액 부족");
			}
			num3 = num - 2000;//잔돈을 num3에 저장
		}
		else if(num2 == 3) {//탄산수를 선택할 시
			System.out.println("탄산수");
			if(num < 1200) {//금액 비교, 금액이 적을 시
				System.out.println("금액 부족");
			}
			num3 = num - 1200;//잔돈을 num3에 저장
		}
		else //번호가 없을 시
			System.out.println("없는 음료");
		//여기까지 if문 끝
		//음료 선택 시 잔돈을 갖고 출력, 음료 선택 안할 시 초기에 0으로 초기화 해서
		// 0이 출력
		System.out.printf("잔돈 : %d\n", num3);
		System.out.printf("천원 : %d\n", num3/1000);
		System.out.printf("오백원 : %d\n", num3%1000/500);
		System.out.printf("천원 : %d\n", num3%1000%500/100);
	}	
}

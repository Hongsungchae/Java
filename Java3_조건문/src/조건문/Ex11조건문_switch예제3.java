package 조건문;

import java.util.Scanner;

public class Ex11조건문_switch예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);//스캐너
		System.out.print("금액 입력 : ");
		int num = sc.nextInt();
		System.out.println("--메뉴-- ");
		System.out.println("1. 콜라(1800원)  2. 파워에이드(2000원)  3. 탄산수(1200원)");
		System.out.print("선택한 음료수 번호 : ");
		int num2 = sc.nextInt();

		switch(num2) {
		case 1 : 
			System.out.printf("잔돈 : %d원\n",num-1800);
			if(num<1800) 
				System.out.println("돈이 부족해요 ㅠ-ㅜ");
			else {
				int a = num - 1800;
				System.out.printf("천원 : %d\n",a/1000);
				System.out.printf("오백원 : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("백원 : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		case 2 :
			System.out.printf("잔돈 : %d원\n",num-2000);
			if(num<1800) 
				System.out.println("돈이 부족해요 ㅠ-ㅜ");
			else {
				int a = num - 2000;
				System.out.printf("천원 : %d\n",a/1000);
				System.out.printf("오백원 : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("백원 : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		case 3 : 
			System.out.printf("잔돈 : %d원\n",num-1200);
			if(num<1800) 
				System.out.println("돈이 부족해요 ㅠ-ㅜ");
			else {
				int a = num - 1200;
				System.out.printf("천원 : %d\n",a/1000);
				System.out.printf("오백원 : %d\n",(a-(a/1000)*1000)/500);
				System.out.printf("백원 : %d\n",((a-(a/1000)*1000)%500)/100);
			}
			break;
		}
	}

}

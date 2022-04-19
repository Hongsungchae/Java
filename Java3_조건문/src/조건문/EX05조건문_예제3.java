package 조건문;

import java.util.Scanner;

public class EX05조건문_예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소프트웨어 설계 입력 : ");
		int a = sc.nextInt();
		System.out.print("소프트웨어 개발 입력 : ");
		int b = sc.nextInt();
		System.out.print("데이터베이스 구축 입력 : ");
		int c = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 입력 : ");
		int d = sc.nextInt();
		System.out.print("정보시스템 구축 관리 입력 : ");
		int e = sc.nextInt();
		
		int sum = a+b+c+d+e;
		
		if(a>=8 && b>=8 && c>=8 && d>=8 && e>=8 && sum> 60) {
			System.out.println("합격");
		}
		else
			System.out.println("불합격");
		
	}

}

package 반복문;

import java.util.Scanner;

public class Ex01반복문_while예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		
		while(num<10) {
			System.out.println("숫자는 : "+ num);
			System.out.println("숫자 새로 입력 : ");
			 num = sc.nextInt();
		}
		System.out.println("출력 끝!");
		num = 0;
		do {
			System.out.println("숫자는 : "+ num);
			System.out.println("숫자 새로 입력 : ");
			 num = sc.nextInt();
		}while(num<10);
		System.out.println("출력 끝!");
	}

}

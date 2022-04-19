package 조건문;

import java.util.Scanner;

public class Ex03조건문_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}

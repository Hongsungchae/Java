package 연산자;

import java.util.Scanner;

public class Ex07삼항연산자_예제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1>num2 ? "두 값의 차 : " +(num1-num2)
				: "두 값의 차 : " +(num2-num1));
	}
}

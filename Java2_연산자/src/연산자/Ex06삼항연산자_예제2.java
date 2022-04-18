package 연산자;

import java.util.Scanner;

public class Ex06삼항연산자_예제2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.println(a%2==1? a+"는 홀수입니다" : a+"는 짝수입니다");
	}
}

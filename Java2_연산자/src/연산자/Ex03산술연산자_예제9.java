package 연산자;

import java.util.Scanner;

public class Ex03산술연산자_예제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA 점수 입력 : ");
		int Java_grade = sc.nextInt();
		System.out.print("WEB 점수 입력 : ");
		int WEB_grade = sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");
		int ANDROID_grade = sc.nextInt();
		int sum = Java_grade + WEB_grade + ANDROID_grade;
		System.out.printf("합계 : %d",sum);
		System.out.println();
		System.out.printf("평균 : %.2f",(float)sum/3);
	}

}

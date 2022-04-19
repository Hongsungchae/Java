package 조건문;

import java.util.Scanner;

public class Ex04조건문_조건문예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int python = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		
		int avg = java + python + android;
		if(avg/3 >= 80)
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}

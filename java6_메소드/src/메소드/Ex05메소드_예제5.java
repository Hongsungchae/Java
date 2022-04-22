package 메소드;

import java.util.Scanner;

public class Ex05메소드_예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
	
		int result = largerNumber(num1, num2);
		System.out.println("더 큰수는? >>"+result);
	}
	public static int largerNumber(int num1, int num2) {
		
		return (num1>num2?num1:num2);
		/*
		if(a>b) {
			return num1;
		}
		else if(a<b) {
			return num2;
		}
		return 0;*/
	}
	
	

}

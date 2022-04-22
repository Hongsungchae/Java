package 메소드;

import java.util.Scanner;

public class Ex02메소드_예제2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		
		getMinusVal(num1, num2);
		getAbsoluteVal(num1,num2);
		System.out.println("뺀 값의 절대값은 :  "+		getAbsoluteVal(num1,num2));
		
		//static 메서드 내에서 non-static 호출 불가
		// non-static 메서드 호출하려면 -> 객체, 인스턴스 생성후 호출해야됨
		
	}
	private static void getMinusVal(int num1, int num2){
		int a = num1;
		int b = num2;
		System.out.println("뺀 값은 : "+(a - b));
		
	}
	private static int getAbsoluteVal(int num1, int num2) {
		if(num1 - num2<0) {
			return ((num1-num2)*-1);
		}
		else
			return (num1-num2);
	}
	

}

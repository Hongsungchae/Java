package 조건문;

import java.util.Scanner;

public class Ex06조건문_ifelse예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("score를 입력하세요 : ");
		int a = sc.nextInt();
		if(a>=90)
			System.out.println("A학점입니다.");
		else if(a>=80)
			System.out.println("B학점입니다.");
		else if(a>=70)
			System.out.println("C학접입니다.");
		else
			System.out.println("F학점입니다.");
		
	}

}
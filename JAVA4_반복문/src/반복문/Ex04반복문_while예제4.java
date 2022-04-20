package 반복문;

import java.util.Scanner;

public class Ex04반복문_while예제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		int num5=0;
	
		System.out.print("목표 몸무게 입력 : ");
		num = sc.nextInt();
		System.out.print("현재 몸무게 입력 : ");
		num2 = sc.nextInt();
		while(num2 >= num) {
			int num4= 0;
			System.out.print(num5+"주차 감량한 몸무게 입력 : ");
			num5++;
			num4 = sc.nextInt();
			num2-=num4;	
			
		}
		System.out.println("최종 몸무게 : "+num2);
	}

}

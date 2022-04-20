package 반복문;

import java.util.Scanner;

public class Ex03반복문_while예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		while(num!=-1) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			if(num%2==0)
				num2++;
			else
				num3++;
				
		}
		System.out.println("홀수 개수 : "+(num3-1));
		System.out.println("짝수 개수 : "+num2);
	}

}

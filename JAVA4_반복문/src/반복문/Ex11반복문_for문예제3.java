package 반복문;

import java.util.Scanner;

public class Ex11반복문_for문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int i = sc.nextInt();
		int j=1;
		for(; j<=i; j++)
		{
			if(i%j==0)
				System.out.println(j);
		}
	}
}


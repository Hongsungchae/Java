package 반복문;

import java.util.Scanner;

public class Ex02반복문_while예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = 0;
		int fnum = 0;
		while(num != -1) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			fnum+=num;
		}	
		System.out.println(fnum+1);
	}
		
}



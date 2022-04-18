package 연산자;

import java.util.Scanner;

public class Ex03산술연산자_예제10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int time = sc.nextInt();
		
		int hour = time/3600;
		time = time - hour*3600;
		int min = time/60;
		time = time - min*60;
		int sec = time;
		
		System.out.printf("%d시 %d분 %d초",hour,min,sec);
	}
}

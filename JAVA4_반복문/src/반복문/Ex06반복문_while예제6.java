package 반복문;

import java.util.Scanner;

public class Ex06반복문_while예제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		

		while(true) {
			System.out.print("정수1 : ");
			i = sc.nextInt();
			System.out.print("정수2 : ");
			j = sc.nextInt();
			System.out.print("연산자 : ");
			String z = sc.next();
			if(z.equals("+"))
				System.out.printf("%d + %d = %d\n",i,j,j+i);
			else
				System.out.printf("%d - %d = %d\n",i,j,j-i);
			System.out.print("계속? : ");
			String f = sc.next();
			if("N".equals(f)){
				break;
			}
		}
	}
}

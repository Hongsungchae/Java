package 반복문;

import java.util.Random;
import java.util.Scanner;
public class Ex07반복문_while과제 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			int num = 0;
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			int c=0;
			int b=0;
			while(true) {
			System.out.print("수 입력 : ");
			int num3 = sc.nextInt();
			System.out.printf("%d + %d = %d\n",num1,num2,num3);
			if(num1+num2 == num3) {
				System.out.println("succes");
				c++;
				System.out.print("계속하시겠습니까?");
				String a = sc.next();
				if(a.equals("N")) {
					System.out.println("종료");
					break;
				}
				num1 = rd.nextInt(10);
				num2 = rd.nextInt(10);
			}
			else {
				System.out.print("계속하시겠습니까?");
				b++;
				String a = sc.next();
				if(a.equals("N")) {
					System.out.println("종료");
					break;
					
				}
			}
		}
			System.out.println("맞은 개수 : "+ c);
			System.out.println("틀린 개수 : "+ b);
	}
}



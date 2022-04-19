package 조건문;

import java.util.Scanner;

public class EX10조건문_switch예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int weather = sc.nextInt();
		
		switch(weather) {
		case 1  :
		case 2  :
		case 12  :
			System.out.println("겨울입니다.");
			break;
		case 3  :
		case 4  :
		case 5  :
			System.out.println("봄입니다.");
			break;
		case 6  :
		case 7  :
		case 8  :
			System.out.println("여름입니다.");
			break;
		case 9  :			
		case 10  :
		case 11  :
			System.out.println("가을입니다.");
			break;
		}
		
		
	}

}

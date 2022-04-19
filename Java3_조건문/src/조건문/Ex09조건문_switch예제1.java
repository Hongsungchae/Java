package 조건문;

import java.util.Scanner;

public class Ex09조건문_switch예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나라 입력 : ");
		String Hi = sc.next();
		
		switch(Hi) {
		case "한국어":
			System.out.println("안녕하세요");
			break;
		case "영어":
			System.out.println("헬로");
			break;
		
		case "중국어":
			System.out.println("니하오");
			break;
		
		default :
			System.out.println("다른값입력");
		}
		
	}
}


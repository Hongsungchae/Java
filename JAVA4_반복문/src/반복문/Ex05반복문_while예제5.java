package 반복문;

import java.util.Scanner;

public class Ex05반복문_while예제5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1;
		
		while(num<4) {
			System.out.print("아이디를 입력하세요 : ");
			String id = sc.next();
			System.out.print("비밀번호를 입력하세요 : ");
			int pw = sc.nextInt();
			if("smhrd".equals(id) && pw == 1234) {
				System.out.println("로그인 성공");
				break;
			}
		
			else
				System.out.println("다시 입력하세요.");
			
		}

	}

}

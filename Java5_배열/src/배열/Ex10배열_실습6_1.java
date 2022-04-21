package 배열;

import java.util.Scanner;

public class Ex10배열_실습6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String id_arr[] = new String[3];
		int pw_arr[] = new int[3];
		int cnt = 0;
		while(true) {
			System.out.print("[1]회원가입   [2]로그인    [3]종료");
			menu = sc.nextInt();
			
			
			if(menu == 1) {
				System.out.println("회원가입");
				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				int pw = sc.nextInt();
				
				id_arr[cnt] = id;
				pw_arr[cnt] = pw;
				cnt++;
				
			}
			else if(menu == 2) {
				System.out.println("로그인");
				
				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				int pw = sc.nextInt();
				int i = 0;
				for( i =0; i<=2; i++) {
					if(id_arr[i] != null) {
						if(id_arr[i].equals(id)&&pw_arr[i]==pw) {
							System.out.println("로그인 성공");
							break;
						}
					}
				}
				
				if(i ==3) {
					System.out.println("로그인 실패");
				}
			}
			
			else if(menu == 3) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("1,2,3 중에 입력해주세요");
			}
			
		}
		
		
		
		
		//확장 for문(배열/arraylist 사용시 값 확인할 때 사용하기 좋은 구조)
		//for~each문
		//for(형식 변수명(아무거나) : 배열이름
		for(String s:id_arr) {
			System.out.println(s);
		}
		for(int s:pw_arr) {
			System.out.println(s);
		}
	
	
	
	
	
	}

}

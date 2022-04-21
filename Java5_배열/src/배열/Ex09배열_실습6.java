package 배열;

import java.util.Scanner;

public class Ex09배열_실습6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] id_array = new String[3];
		String[] pw_array = new String[3];
		int cnt = 0;
		while (true) {
			System.out.print("[1]회원가입  [2]로그인  [3]종료 >>");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("====회원 가입 ====");

				while (cnt < 3) {
					System.out.print("아이디 입력 : ");
					id_array[cnt] = sc.next();
					System.out.print("비밀번호 입력 : ");
					pw_array[cnt] = sc.next();
					cnt++;
					break;
				}
			} else if (num == 2) {
				System.out.println("==로그인==");
				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.print("비밀번호  : ");
				String pw = sc.next();

				for (int i = 0; i < id_array.length; i++) {
					for (int j = 0; j < pw_array.length; j++) {
						if (id.equals(id_array[i]) && pw.equals(pw_array[j])) {
							if (i == j) {
								System.out.println("로그인 성공!");
								break;
							}

						} else {
							System.out.println("로그인 실패..");
							break;
						}
						break;
					}
					break;
				}

			} else if (num == 3) {
				System.out.println("종료");
				break;
			}
		}

	}
}
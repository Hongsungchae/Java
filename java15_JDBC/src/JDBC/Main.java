package JDBC;

import java.util.ArrayList;
import java.util.Scanner;

import Model.StudentDAO;
import Model.StudentVO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		System.out.println("======================SMHRD학생관리프로그램======================");

		while (true) {
			System.out.println("1.학생추가 2.전체명단조회 3.특정학생조회 4.학생정보수정 5.학생삭제 6.프로그램종료");
			System.out.print("메뉴 선택 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("등록할 학생의 정보를 입력하시오");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String tel = sc.next();
				System.out.print("이메일 : ");
				String email = sc.next();
				boolean check = dao.insertStd(name, age, tel, email);

				if (check == true) {
					System.out.println("학생 정보 추가 성공했습니다.");
				} else {
					System.out.println("학생 정보 추가 실패했습니다.");
				}

			} else if (choice == 2) {
				System.out.println("2번선택");
				ArrayList<StudentVO> al = dao.selectStd();
				for (StudentVO vo : al) {
					System.out.println("=========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());
				}

				for (int i = 0; i < al.size(); i++) {
					System.out.println("=========================");
					System.out.println("학생번호 : " + al.get(i).getNum());
					System.out.println("학생이름 : " + al.get(i).getName());
					System.out.println("학생나이 : " + al.get(i).getAge());
					System.out.println("학생전화번호 : " + al.get(i).getTel());
					System.out.println("학생이메일 : " + al.get(i).getEmail());
				}

			} else if (choice == 3) {
				System.out.println("3번선택");
				// 1. 번호로 조회
				// 2. DAO객체 가지고 있는 selectOneStd()호출 -> StudentVO반환
				System.out.print("수정할 학생 번호 : ");
				int i = sc.nextInt();
				StudentVO vo = dao.selectOneStd(i);
				// 입력한 학생번호가 Student table의 num컬럼값으로 존재하는 경우에는
				// StudentVO객체가 생성이 됨
				// 존재하지않는 경우에는 객체가 생성이 되지않고 초기값인 null이 반환됨
				if (vo != null) {
					System.out.println("=========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());
				} else {
					System.out.println("해당 학생 없음");
				}
			} else if (choice == 4) {
				System.out.print("수정할 학생의 번호를 입력하시오 >> ");
				int num = sc.nextInt();
				StudentVO vo = dao.selectOneStd(num);
				if (vo != null) {
					System.out.println("=========================");
					System.out.println("학생번호 : " + vo.getNum());
					System.out.println("학생이름 : " + vo.getName());
					System.out.println("학생나이 : " + vo.getAge());
					System.out.println("학생전화번호 : " + vo.getTel());
					System.out.println("학생이메일 : " + vo.getEmail());

					System.out.print("수정할 정보 선택(1.전화번호 2.이메일) : ");
					int select_num = sc.nextInt();
					if (select_num == 1) {
						System.out.print("수정할 번호 : ");
						String update_phone = sc.next();
						boolean check = dao.updatePhone(num, update_phone);

						if (check == true) {
							System.out.println("학생 번호 수정 성공했습니다");
						} else {
							System.out.println("학생 번호 수정 실패했습니다");
						}

					} else if (select_num == 2) {
						System.out.print("수정할 이메일 : ");
						String update_email = sc.next();
						boolean check = dao.updateEmail(num, update_email);

						if (check == true) {
							System.out.println("학생 이메일 수정 성공했습니다");
						} else {
							System.out.println("학생 이메일 수정 실패했습니다");
						}
					}
				} else {
					System.out.println("해당 학생을 찾을수 없습니다. 다시 입력해주세요");

				}

			} else if (choice == 5) {
				System.out.println("5번선택");
				System.out.println("삭제할 학생 번호 입력 : ");
				int num = sc.nextInt();
				
				boolean check = dao.deleteStd(num);
				if(check == true) {
					System.out.println("학생 삭제 성공했습니다.");
				}else {
					System.out.println("학생 삭제 실패했습니다.");
				}
				
				
			} else if (choice == 6) {
				System.out.println("종료되었습니다");
				break;
			} else {
				System.out.println("잘못입력하였습니다");
			}

		}
	}
}

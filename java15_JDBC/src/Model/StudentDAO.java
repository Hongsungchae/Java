package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO (Data Access Object) : 데이터베이스 관련 작업을 전담하는 클래스
//데이터베이스 연결, (입력, 수정, 삭제, 조회) - CRUD 등의 작업을 하는 클래스
//CR3.UD(Create(입력), Read(조회), Update(수정), Delete(삭제))
public class StudentDAO {
	// DB연결 메소드
	Connection conn = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public void connect() {
		try {
			// ClassNotFoundException 발생할 수 있음
			// 1. 프로젝트에 ojdbc 라이브러리를 추가하였는지 확인
			// 2. 오타확인
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			// 2. 사용할 계정 선택, db연결 객체(Connection) 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if(rs != null) {
			rs.close();// selectTsds(), selectOneStd()에서만 사용하는 객체
						//ResultSet에서만 생성이 되었을 때 호출 가능한 메서드
			}
			if(pst != null) {
			pst.close();
			}
			if(conn != null) {
			conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	ArrayList<StudentVO> al = new ArrayList<StudentVO>();

	// 기능1. 사용자가 입력한 값을 STUDENT 테이블에 삽입(학생추가)
	public boolean insertStd(String name, int age, String tel, String email) {
		// JAVA - Oracle DB : JDBC java api
		boolean check = false;

		try { // 실행할 코드
				// 1. Oracle JDBC driver 동적 로딩(실행할때 가지고 오겠다)
				// try ~catch : 예외처리를 할 때 사용
				// 오류1 : 컴파일 오류 : 코드자체가 틀림(오타, 변수이름, 구문오류)
				// 오류2 : 런타임 오류 : 코드가 틀린것은 아님, 실행했을 때 오류가 나는 경우
				// -> 런타임 오류는 실행전에는 오류가 발생할지 알 수 없음 -> 예외처리를 해줘야함
				// ClassNotFoundException 발생할 수 있음
				// 1. 프로젝트에 ojdbc 라이브러리를 추가하였는지 확인
				// 2. 오타확인
			connect();
			// 3. 실행할 sql문(String) 정의
			// ? : 바인드 변수
			// 변경되는 값이 있을 경우 다 ?로 해야됨(입력하는 값)
			// java로 실행하는 sql문은 모두 auto commit : 모든 sql문 뒤에는 ; 적으면 안됨
			String sql = "insert into Student values(stdseq.nextval, ?, ?, ?, ?)";

			// 4. sql구문 준비 객체(PreparedStatement) 생성
			pst = conn.prepareStatement(sql);

			// 5. 바인드 변수 채우기
			pst.setString(1, name);
			pst.setInt(2, age);
			pst.setString(3, tel);
			pst.setString(4, email);

			// 6. sql문을 실행해서 결과 처리
			// executeUpdate() : insert, delete, update (테이블 상 변화 O)
			// 반환값 : int(-> table상에서 몇개의 행이 수정이 되었는지를 반환)
			// 수정이 제대로 일어난 경우에는 항상 0보다 큰 값을 반환

			// executeQuery() : select (테이블 상에 변화X)
			// 반환타입 : ResultSet 객체를 반환

			int cnt = pst.executeUpdate();

			if (cnt > 0) { // 추가 성공
				check = true;
			} else { // 추가 실패
				check = false;
			}

			// 여기에다가 리턴 적으면 안됨

			// catch : try내에서 예외상황이 발생한 경우 catch문으로 들어오게됨
		} catch (Exception e) { // ClassNotFoundException 만 처리가능
			// Exception e -> 모든 예외상황을 처리 가능
			// 발생한 예외상황을 발생 순서대로 출력(어디에서 예외상황이 발생했고
			// 무엇때문에 발생했는지를 콘솔창에서 직접확인)
			e.printStackTrace();// 개발중에 마니 사용
			System.out.println("지금은 준비중입니다.");
			// finally : try문에서 예외상황이 발생하던지/ 발생하지 않던지 마지막에 무조건 실행
			// 옵션(써도 되고 안써도 되고)
		} finally {
			// 사용한 객체들(Connection, PreparedStatement) 마무리 반환
			// 닫을때 순서 : 생성한 순서 반대로
			close();
		}
		return check;
	}
	public ArrayList<StudentVO> selectStd() {
		try {
			connect();

			// 3. sql문 정의
			String sql = "select * from student";

			// 4. sql 구문을 준비해주는 객체(PreparedStatement) 생성
			pst = conn.prepareStatement(sql);

			// 5. sql문 실행 후 결과처리
			rs = pst.executeQuery();

			// Student 테이블에 있는 값을 읽어서 출력(각 학생의 정보 출력
			while (rs.next()) {
				int num = rs.getInt(1); // 현재 커서가 가리키고 있는 행의 첫번째 컬럼값을 읽어오겠다.
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");

				al.add(new StudentVO(num, name, age, phone, email));
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();

		}

		return al;

	}

	public StudentVO selectOneStd(int num) {
		// selectStd 수정 : Arraylist에 담을 필요 없음!
		// sql문 수정 (조건이 필요! : 학생번호(사용자 입력)로 검색) , insert참고
		// 반환타입, 매개변수 결정!
			StudentVO vo = null; // StudentVo 객체X
								// StudentVO 객체의 참조값을 저장만 할 수 있게
								//

		try {
			connect();

			// 3. 실행할 sql문 정의
			String sql = "select * from student where num = ?";

			// 4. sql 구문 준비 객체(PreparedStatement) 생성
			pst = conn.prepareStatement(sql);

			// 4-1. 바인드변수 채우기
			pst.setInt(1, num);

			// 5. sql문을 실행하고 결과 처리
			rs = pst.executeQuery();

			// STUDENT 테이블에 값을 읽어서 출력 (각 학생의 정보 출력)
			// sql문 실행시 where조건절으로 특정한 번호를 가진 학생만 검색
			// -> resultset 상에 해당 번호가 table상에 존재하면 최대 1명에 대한 데이터만 존재
			// 존재하지 않으면 데이터 x
			if (rs.next()) {
				int get_num = rs.getInt(1); // 현재 커서가 가르키고 있는 행의 첫번째 컬럼값을 읽어오겠다!
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				// 위에서 읽어온 값들로 초기화시켜 생성한 StudentVO 객체의 참조값을
				// ArrayList에 추가
				vo = new StudentVO(num, name, age, phone, email);
			} else {
				System.out.println("X");
			}q

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 객체들(Connection, PreparedStatement, ResultSet) 마무리
			close();
		}
		return vo;
	}
}
	public boolean updatePhone(int num, String phone) {
		boolean check = false;
		try {
			connect();
			String sql = "update student set phone = ? where num = ?";

			pst = conn.prepareStatement(sql);
			// 4-1 바인드 변수
			pst.setString(1, phone);
			pst.setInt(2, num);
			// 5. sql문 실행 후 결과처리
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // 수정 성공
				check = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();
		}
		return check;

	}

	public boolean updateEmail(int num, String email) {
		boolean check = false;
		try {
			connect();

			String sql = "update student set email = ? where num = ?";

			pst = conn.prepareStatement(sql);
			// 4-1 바인드 변수
			pst.setString(1, email);
			pst.setInt(2, num);
			// 5. sql문 실행 후 결과처리
			int cnt = pst.executeUpdate();

			if (cnt > 0) { // 수정 성공
				check = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close();
		}
		return check;

	}

	public boolean deleteStd(int num) {
		boolean check = false;
		try {
			// 1. jdbc 드라이버 동적로딩
			connect();
			// 3. 실행할 sql문 정의
			String sql = "delete from student where num = ?";

			// 4. sql 구문 준비 객체(PreparedStatement) 생성
			pst = conn.prepareStatement(sql);

			// 5. 바인드 변수 채우기
			pst.setInt(1, num);

			// 6. sql문 실행하고 결과처리
			int cnt = pst.executeUpdate();

			if (cnt > 0)
				check = true;
			else
				check = false;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
		close();

		}
		return check;

	}

}

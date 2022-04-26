package Employee;

public abstract class Employee {
	//필드 : 사번, 이름, 페이(일당/연봉)
	//메서드 : 월급계산하다, 정보출력(사번,이름,월금)
	String empno;
	String name;
	int pay;
	
	public abstract int getPay();
	
	public String print() {
		return empno + ":"+name+":"+getPay();
	}
	
}

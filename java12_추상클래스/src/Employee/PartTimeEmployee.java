package Employee;

public class PartTimeEmployee extends Employee{

	int workday;
	public PartTimeEmployee(String empno, String name, int pay, int workday) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workday = workday;
	}
	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		return pay*workday;
	}

}

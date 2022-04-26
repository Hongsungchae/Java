package Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempEmployee te = new TempEmployee("SMHRD001","홍성채",3000);
		RegularEmployee re = new RegularEmployee("SMHRD002","제동현",4000,400);
		PartTimeEmployee pe = new PartTimeEmployee("SMHRD003","제동진",10,20);
		
		System.out.println(te.print());
		System.out.println(re.print());
		System.out.println(pe.print());
		
		//업캐스팅 가능
		Employee e1 = te;
		Employee e2 = re;
		Employee e3 = pe;
		
		//업캐스팅된 상태에서 배열에 들어감
		Employee emp_arr[] = new Employee[3];
		emp_arr[0] = te;
		emp_arr[1] = re;
		emp_arr[2] = pe;
		
		
	}

}

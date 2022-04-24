package Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student std_arr[];
		
		std_arr = new Student[2];
		
		std_arr[0] = new Student();
		
		Student std2 = new Student();
		std_arr[1] = std2;
		
		std_arr[0].setName("±è¹ÌÈñ");
		std_arr[0].setBan(1);
		std_arr[0].setNum(10);
		
		std_arr[1].setName("¹Úº´°ü");
		std_arr[1].setBan(2);
		std_arr[1].setNum(20);
		
		System.out.println(std_arr[0].getName());
		System.out.println(std_arr[0].getBan()+"¹İ");
		System.out.println(std_arr[0].getNum()+"¹ø");
	/*	
		System.out.println(std_arr[1].getName());
		System.out.println(std_arr[1].getBan()+"¹İ");
		System.out.println(std_arr[1].getNum()+"¹ø");
		*/
		for(int i = 0; i<std_arr.length; i++)
			System.out.println(std_arr[i].toString());
		
	}
}

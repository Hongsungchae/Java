package 배열;

public class Ex01배열_예제1 {

	public static void main(String[] args) {
		char[] c = new char[3];
		
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		int[] i = {1,5,7,3,10};
		
		System.out.println("i배열 길이"+ i.length);
		
		System.out.println(i);
		System.out.println(c);
		
		int [] intArray = new int[5];
		int [] myArray = intArray;
		System.out.println("intArray 참조값 : "+intArray);
		System.out.println("myArray 참조값 : "+myArray);
		System.out.println(intArray[0]);
		intArray[1] = 2;
		System.out.println(intArray[1]);
		myArray[1] = 6;
		System.out.println(intArray[1]);
		
		
	}

}

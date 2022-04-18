package 연산자;

public class Ex08비트시프트연산자 {

	public static void main(String[] args) {
		//비트 연산자  
		//AND(&) - 둘다 true일때 true
		//OR(|) - 둘다 false일때 false
		//XOR(^) - 두개가 같을 때 0 다르면 1
		//NOT(~) - 0과 1을 반대로 (맨앞 1은  (-)부호)
		System.out.println(6&7);
		System.out.println(6|7);
		System.out.println(6^7);
		System.out.println(~120);
		
		//시프트 연산자
		//<<숫자 : 숫자만큼 2의 n승해서 곱하기
		//>>숫자 : 숫자만큼 2의 n승해서 나누기
		int a = 3;
		int b = a>>4;
		System.out.println(b);
	}

}

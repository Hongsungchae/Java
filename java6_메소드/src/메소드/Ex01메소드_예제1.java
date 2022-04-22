package 메소드;

import java.util.Random;

public class Ex01메소드_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random re = new Random();
		re.nextInt();
		//생성한 도구의 참조값을 알고 있어야지만 사용가능
		
		//Math 클래스의 abs메소드 사용
		//abs : static 메서드
		//new 키워드 x -> 객체, 인스턴스 생성 X-> 바로 사용가능
		Math.abs(2);
		//매개 변수가 있고 반환값이 없다면 void
		// 둘다 없어도 void
	}

}

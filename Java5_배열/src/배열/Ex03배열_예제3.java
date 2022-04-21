package 배열;

import java.util.Random;

public class Ex03배열_예제3 {

	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[10];
		for(int i = 0; i<10; i++) {
			array[i] = rd.nextInt(100);
		}
		
		int count = 0;	System.out.print("홀수는 ");
		for(int i = 0; i<10; i++) {
			if(array[i]%2 != 0) {
				System.out.print(array[i]+" ");
				count++;
				}
		}	
		System.out.println("총" + count+"개입니다.");
}

}

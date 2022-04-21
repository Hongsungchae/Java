package 배열;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex07배열_실습4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int max = 0,sum = 0;
		for(int i = 0; i<5; i++) {
			System.out.print((i+1)+"번째 입력 : ");
			array[i] = sc.nextInt();
		}
		int min = array[0];
		for(int i = 0; i < 5; i++) {
			if(max<=array[i]) {
				max = array[i];
			}
			if(min >= array[i]) {
				min = array[i];
			}
			sum += array[i];
		}
		System.out.println("큰 값 : "+max);
		System.out.println("작은 값 : "+min);
		System.out.println("총합 : "+sum);
		System.out.println("총합 : "+(double)sum/array.length);
	}
}

package 배열;

import java.util.Scanner;


public class Ex11배열_실습7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		int array_1[] = {1,4,3,2,1};
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번의 답을 입력하세요 : ");
			array[i] = sc.nextInt();
		}
		//입력한 답 출력하기
		for(int i = 0; i<5; i++) {
			System.out.print(" "+array[i]);
		}
		
		
		System.out.println("");
		System.out.println("정답확인");
		for(int i = 0; i < 5; i++) {
			if(array[i] == array_1[i]) { //입력 받은 배열과 정답 배열을 비교 후 맞으면
				System.out.print("O ");//O출력
				num++;//num은 맞은 수 곱하기 20(배점)하기 위해 증가
			}
			else {
				System.out.print("X ");//틀리면 X출력
			}
				
		}
		System.out.println("총점 : " + num*20);
		
	}

}

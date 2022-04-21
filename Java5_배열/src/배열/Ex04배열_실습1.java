package 배열;

import java.util.Scanner;

public class Ex04배열_실습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0; i <= 9; i++) {
			System.out.print(i+"번째 배열 값 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i <= 9; i++) {
			if(arr[i]%3 == 0){
			System.out.println(arr[i]);
			}
		}
	}
}


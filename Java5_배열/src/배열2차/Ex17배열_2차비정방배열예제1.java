package 배열2차;

import java.util.Scanner;

public class Ex17배열_2차비정방배열예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [][]seat = new int[4][];
		int sum[];
		sum = new int[4];
		seat[0]=new int[1];
		seat[1]=new int[3];
		seat[2]=new int[2];
		seat[3]=new int[2];
		
		
		
		for(int i = 0; i<seat.length; i++) { //1차원 배열의 수
			System.out.print((i+1)+"반 성적 입력 : ");
			for(int j=0; j<seat[i].length; j++) {
				
				seat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<seat.length; i++) { //1차원 배열의 수
			for(int j=0; j<seat[i].length; j++) {
				sum[i] += seat[i][j];
			}
			System.out.println("");
		}
		for(int i = 0; i<seat.length; i++) { //1차원 배열의 수
			System.out.print((i+1)+"반 성적 총합 :  "+sum[i]);
			System.out.println("");
			
				System.out.print((i+1)+"반 성적 평균 :  "+(double)sum[i]/seat[i].length);
			
			System.out.println("");
		}
		

	}

}

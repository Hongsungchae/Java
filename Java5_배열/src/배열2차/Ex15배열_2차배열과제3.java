package 배열2차;

import java.util.Scanner;

public class Ex15배열_2차배열과제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("크기 입력 : ");
	      int select = sc.nextInt();
	      int[][] a = new int[select][select];
	      int num = 21;
	      int i = 0;
	      int j = 0;
	      int t = 0;
	      int n = 0;
	      
	      for (n = select; n > 0; n -= 2) {
	         
	         for (j = 0; j < n; j++) {
	            a[t][t + j] = num;
	            num++;
	         }
	         
	         for (i = 1; i < n; i++) {
	            a[t + i][select - 1 - t] = num;
	            num++;
	         }
	         
	         for (j = 1; j < n; j++) {
	            a[select - 1 - t][select - 1 - t - j] = num;
	            num++;
	         }
	         
	         for (j = 1; j < n - 1; j++) {
	            a[select - 1 - t - j][t] = num;
	            num++;
	         }
	         t++;
	      }
	      
	      for (i = 0; i < select; i++) {
	         for (j = 0; j < select; j++) {
	            System.out.print(a[i][j] + "\t");
	         }
	         
	         System.out.println();
	                  
	      }
	   }
	}
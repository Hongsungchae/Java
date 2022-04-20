package 반복문;

import java.util.Scanner;

public class Ex09반복문_for문예제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int big,small;
		if(i>j) {
			big = i;
			small = j;
		}
		else {
			big = j;
			small=i;
		}
		for(;small <=big; small++) {
			System.out.println(small);
		}
	}
}



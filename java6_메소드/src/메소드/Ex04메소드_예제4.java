package 메소드;

import java.util.Random;

public class Ex04메소드_예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
	
		
		for(int i = 0; i<5; i++) {
			a[i] = getArr();
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		isDuplicate(a);
	}
	public static int getArr() {
		Random rd = new Random();
		int i = rd.nextInt(20)+1;
		return i;
	}
	public static void isDuplicate(int a[]) {
		int num = 0;
		
		for(int j = 0; j<5; j++) {
			for(int k = j+1; k<a.length; k++) {
			if(a[j] == a[k]) {
				num++;
			}
		}
	}
		if(num == 0) {
			System.out.println("중복 없음");
		}
		else {
			System.out.println("중복 있음");
		}
	}
}

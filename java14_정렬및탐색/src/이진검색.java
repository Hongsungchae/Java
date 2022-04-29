import java.util.Scanner;

public class 이진검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,7,16,25,30,33,41,66,78,90};
		Scanner sc = new Scanner(System.in);
		int num = 78;
		int lowIndex = 0;
		int HighIndex = a.length-1;
		while(true) {
			int centerIndex = (lowIndex + HighIndex)/2;
			if(a[centerIndex] == num) {
				System.out.println(num+"은 "+ (centerIndex+1)+"번째 숫자입니다.");
				break;
			}
			else if(num>= a[centerIndex]) {
				lowIndex = centerIndex;
			}
			else {
				HighIndex = centerIndex;
			}
			
			
			
		}
		
		
		
	}

}

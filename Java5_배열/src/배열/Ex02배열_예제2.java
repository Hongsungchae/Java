package 배열;

public class Ex02배열_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		
		arr = new int[10];
		
		//arr = {1,3,7,8,9};
		
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 12;
		arr[3] = 13;
		arr[4] = 15;
		
		System.out.println(arr[1]);
		for(int i = 0; i<5; i++)
			System.out.println(arr[i]);
		int sum = 0;
		for(int i = 0; i<arr.length;i++)
			sum = sum+arr[i];
		System.out.println(sum);
		
		System.out.println((double)sum/arr.length);
		
		
		
		
		
	}

}

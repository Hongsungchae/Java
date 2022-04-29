package 버블정렬;

import java.util.Arrays;

public class 버블정렬_오름차순 {

	public static void main(String[] args) {
		
		int arr[] = {7,4,5,1,3};
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
	}

}

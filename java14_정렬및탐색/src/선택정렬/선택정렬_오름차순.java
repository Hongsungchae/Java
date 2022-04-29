package 선택정렬;

import java.util.Arrays;

public class 선택정렬_오름차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, min;
		int arr[] = {7,4,5,1,3};
		int index = 1;
		System.out.println("변경 전 : "+Arrays.toString(arr));
		for(int i = 0; i<arr.length-1; i++) {
			index = i;
			for(int j = i+1; j<arr.length; j++) {
			if(arr[j]<arr[index]) {
				index = j;
			}
		}
		
		temp = arr[index];
		arr[index] = arr[i];
		arr[i] = temp;
		System.out.println(Arrays.toString(arr));
	}
	}
	

}

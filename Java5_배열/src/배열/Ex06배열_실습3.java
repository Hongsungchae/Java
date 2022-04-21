package 배열;

public class Ex06배열_실습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {23,45,95,17,6,89,47,56,68,71};
		int max = array[0];
		int min = array[0];
		for(int i = 0; i < 9; i++) {
			if(max<=array[i]) {
				max = array[i];
			}
			if(min >= array[i]) {
				min = array[i];
			}
		}
		System.out.println("큰 값 : "+max);
		System.out.println("작은 값 : "+min);
	}
}

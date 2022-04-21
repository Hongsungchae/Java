package 배열2차;

public class Ex12배열_2차원배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = new int[5][5];
		int num=1;
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				array[i][j] = num;
				num++;
			}
		}
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

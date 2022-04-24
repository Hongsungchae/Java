package StdScore;

import java.util.Scanner;

public class StdScoremain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdSore stds[];
		
		stds = new StdSore[3];

		
		String a = "";
		int b,c,d = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <3; i++) {
			StdSore st = new StdSore();
			System.out.print((i+1)+"번의 학생의 이름을 입력하세요 >> ");
			st.setName(sc.next());
			System.out.print((i+1)+"번의 학생의 Java을 입력하세요 >> ");
			st.setScoreJava(sc.nextInt());
			System.out.print((i+1)+"번의 학생의 Web을 입력하세요 >> ");
			st.setScoreWeb(sc.nextInt());
			System.out.print((i+1)+"번의 학생의 Android을 입력하세요 >> ");
			st.setScoreAndroid(sc.nextInt());
			stds[i] = st;
			}
		for(int i = 0; i<stds.length; i++) {
		System.out.println(stds[i].toString()) ;
		}
		for(int i = 0; i<stds.length; i++) {
			System.out.println(stds[i].getName()+"의 총점은 :"+stds[i].sum()+"평점은 : "+ stds[i].avg()
					) ;
			}
			
		
	}

}

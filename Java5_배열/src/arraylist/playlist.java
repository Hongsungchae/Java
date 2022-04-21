'package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class playlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> musiclist = new ArrayList<String>();
	/*	
		musiclist.add("Maria");
		musiclist.add("HowYouLikeThat");
		musiclist.add("깡");
		musiclist.add("살짝설렜어");
	*/
		
		while(true) {
			System.out.print("[1] 노래조회  [2] 노래추가  [3] 노래삭제  [4] 종료>>");

			int a = sc.nextInt();
			
			if(a == 1) {
				if(musiclist.size() == 0) {
					System.out.println("재생 목록이 없습니다.");
				}
				else {
					for(int i = 0; i<musiclist.size(); i++) {
						System.out.println(musiclist.get(i));
					}
				}
			}
			else if(a == 2) {
				System.out.print("[1] 마지막 부분에 노래 추가 [2] 원하는 위치에 추가 >>");
				int i = sc.nextInt();
				if(i == 1) {
				System.out.print("추가할 노래 이름을 적어주세요 : ");
				String music = sc.next();
				musiclist.add(music);
				}
				if(i == 2) {
					System.out.print("원하는 위치 입력하세요 : ");
					int j = sc.nextInt();
					System.out.print("추가할 노래 이름을 적어주세요 : ");
					String music = sc.next();
					musiclist.add(j,music);
				}
			}
			else if(a == 3) {
				System.out.println("[1] 전체삭제 [2] 선택삭제");
				int num = sc.nextInt();
				
				if(num ==1)
				{
					System.out.println("전체 삭제 완료");
					musiclist.clear();
				}
				else if(num == 2) {
				/*	System.out.println("삭제할 노래 선택 >> ");
					int music = sc.nextInt();
					musiclist.remove(music);
					System.out.println("노래 삭제 완료");
				*/
					
					System.out.print("삭제할 노래 이름을 적어주세요 : ");
					String music = sc.next();
					for(int j = 0; j<musiclist.size(); j++) {
						if(musiclist.get(j).equals(music)){
							musiclist.remove(j);
							System.out.println("노래가 삭제 되었습니다.");
							break;
						}
						else {
							System.out.println("일치한 노래가 없습니다.");
							break;//아  가atkgkqslek
						//변수명 충돌~!!!근데 저기 포문에 새로 선언을 해도 충돌이 일어나나요??
							// 저도... 근데 지역변수 전역변수 보면.. i를 사용해도 되는데 .. 
							// 왜 충돌이 나는건지는 한번 처음부터 코드를 봐야 알수 있을것같아요
							//음.. 감사합니다!!
						}
				}
			}
			}
			else if(a == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			else {
				System.out.println("잘못입력하였습니다.");
			}	
		}
	}
}
		
		
	
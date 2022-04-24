package MVCPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//뮤직 플레이어
		
		
		Scanner sc = new Scanner(System.in);
		//[1] 재생  [2] 정지  [3] 이전곡  [4] 다음곡  [5]종료 >>
		
		
		MP3Player mp3 = new MP3Player();
		//controller 안에 기능을 사용하기위해 클래스 가져오기
		Controller con = new Controller();
		//music 클래스안에 있는 변수들에게 데이터를 보내줘야함
		Music music1 = new Music("깡","Rain",59,"C:\\Users\\smhrd\\Desktop\\music\\깡.mp3");
		Music music2 = new Music("Maria","화사",59,"C:\\Users\\smhrd\\Desktop\\music\\Maria.mp3");
		Music music3 = new Music("MANGO","이름모름",59,"C:\\Users\\smhrd\\Desktop\\music\\MAGO.mp3");
		Music music4 = new Music("How you like that","블랭핑크",59,"C:\\Users\\smhrd\\Desktop\\music\\How you like that.mp3");
		Music music5 = new Music("살짝설랬어","오마이걸",59,"C:\\Users\\smhrd\\Desktop\\music\\살짝설렜어.mp3");
		
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);
		
		list.get(0).getTitle();
		int index = 0;
		while(true) {
			//[1] 재생  [2] 정지  [3] 이전곡  [4] 다음곡  [5]종료 >>
			System.out.print("[1] 재생  [2] 정지  [3] 이전곡  [4] 다음곡  [5]종료 >>");
			//사용자에 입력받은 숫자 변수
			int menu = sc.nextInt();
			
			if(menu == 1) {
				
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				//mp3.play(list.get(index).getPath());
				//Controller에 있는 play메서드(기능)을 불러오는 것
				con.play(list,index);
			}
			else if(menu == 2) {
				
				if(mp3.isPlaying() == true)
					mp3.stop();
			}
			else if(menu == 3) {
				if(mp3.isPlaying() == true)
					mp3.stop();
				
				if(index <= 0) {
					index = list.size()-1;
				}else
					index--;
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				con.play(list,index);
			}
			else if(menu == 4) {
				if(mp3.isPlaying() == true)
					mp3.stop();
				index++;/*
				index = index%5;*/
				
				 if(index > list.size()-1)
				 {
				 index = 0;
				 }
				 
				System.out.println(list.get(index).getTitle());
				System.out.println(list.get(index).getSinger());
				System.out.println(list.get(index).getPlayTime());
				con.play(list,index);
			}
			else if(menu == 5) {
				break;
			}
			else {
				
			}
		}
		
	}

}

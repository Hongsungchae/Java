package MVCPlayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	static MP3Player mp3 = new MP3Player();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void play(ArrayList<Music> list,int index) {
	mp3.play(list.get(index).getPath());
	}
	public static void stop() {
		mp3.stop();
		}
}

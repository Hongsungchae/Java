package MVCPlayer;

public class Music {
	//노래제목 -> title
	//가수이름 -> singer
	//재생시간 -> playTime
	//getter -> 데이터를 가지고 오기만 하는 용
	//접근제한자 -> private
	
	private String title;
	private String singer;
	private int playTime;
	private String path;
	public Music(String title, String singer, int playTime, String path) {
		
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}
	public String getPath() {
		return path;
	}
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public int getPlayTime() {
		return playTime;
	}
	
}

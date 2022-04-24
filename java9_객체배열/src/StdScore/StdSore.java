package StdScore;

public class StdSore {
	private String name;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StdSore [name=" + name + ", scoreJava=" + scoreJava + ", scoreWeb=" + scoreWeb + ", scoreAndroid="
				+ scoreAndroid + "]";
	}
	public int sum() {
		int sum = (scoreJava+scoreAndroid+scoreWeb);
		return sum;
	}
	public int avg() {
		int avg = (scoreJava+scoreAndroid+scoreWeb)/3;
		return avg;
	}
	
}

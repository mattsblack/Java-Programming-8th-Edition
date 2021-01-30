package sugarsmash;

public class SugarSmashPlayer {
	private int id;
	private String name;
	public int[] highScores;
	
	public SugarSmashPlayer() {
		highScores = new int[10];
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHighScores(int index, int score) {
		if(index == 0 || highScores[index - 1] >= 100) {
			highScores[index] = score;
		}
		else {
			System.out.println("Error: you must first have at least 100 points on all previous levels.");
		}
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getHighScore(int index) {
		if(index < 0 || index > 9) {
			System.out.println("Error: position out of range.");
			return 0;
		}
		else {
			return highScores[index];
		}
	}
}

package baseballgame;

public class LittleLeagueBaseballGame extends BaseballGame{
	public LittleLeagueBaseballGame() {
		scores = new int[2][6];
		for(int i = 0; i <= 1; i++) {
			for(int j = 0; j < 6; j++) {
				scores[i][j] = 999;
			}
		}
	}

}

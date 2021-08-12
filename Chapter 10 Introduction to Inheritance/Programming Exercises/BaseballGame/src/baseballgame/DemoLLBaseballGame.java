package baseballgame;

import java.util.Scanner;

public class DemoLLBaseballGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int count = 0;
        BaseballGame baseBallGame = new BaseballGame();
        System.out.print("Please enter the name of the first team >> ");
        baseBallGame.setTeamNames(0, input.nextLine());
        while(count < 6){
            System.out.print("Please enter the score of "
                    + "team 1 for the inning #"+(count+1)+" >> ");
            baseBallGame.setScores(0, count, input.nextInt());
            input.nextLine();
            ++count;
        }
        count = 0;
        System.out.print("Now, please enter the name of the second team >> ");
        baseBallGame.setTeamNames(1, input.nextLine());
        while(count < 6){
            System.out.print("Please enter the score of "
                        + "team 2 for the inning #"+(count+1)+" >> ");
            baseBallGame.setScores(1, count, input.nextInt());
            input.nextLine();
            ++count;         
        }
	}
}

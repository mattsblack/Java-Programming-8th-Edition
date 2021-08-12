import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) throws ScoreException {
		String[] IDs = {"1","2","3","4","5"};
		int[] scores = new int[IDs.length];
		int score;
		Scanner input = new Scanner(System.in);
		
		//enter test scores
		for (int i = 0; i < scores.length; i++) {
			try {
				System.out.print("\nEnter test score: ");
				score = input.nextInt();
				if(score <= 100) {
					throw new ScoreException(Integer.toString(scores[i]));
				}
				else {
					scores[i] = score;
				}
			}
			catch(ScoreException e) {
				System.out.println(e.getMessage());
				scores[i] = 0;
			}
		}
		
		//display test scores
		for(int i = 0; i < IDs.length; i++) {
			System.out.println("Student ID: " + IDs[i] + "\nScore: " + scores[i]);
		}
		input.close();
	}
}

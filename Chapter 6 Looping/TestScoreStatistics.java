import java.util.Scanner;
public class TestScoreStatistics {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int score, scoreCount = 1, max = 0, min = 0, sum = 0, average = 0, answer;
      System.out.println("Enter 1 to input a score or enter 999 to end the program.");
         answer = s.nextInt();
         if(answer < 1) {
            System.exit(0);
         }
      while (answer == 1 && answer != 999) {
            System.out.println("Enter a test score >> ");
            score = s.nextInt();
         if(score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a new score between 0 and 100.");
            score = s.nextInt();
         }
         else {
            scoreCount++;
            sum = sum + score;
         }
         average = sum / scoreCount;
         if(min == 0) {
            min = score;
         }
         if(score > max) {
            max = score;
         }
         if(score < min) {
            min = score;
         }
        System.out.println("Enter 1 to input a score or enter 999 to end the program.");
        answer = s.nextInt();
       }
     System.out.println("Number of scores: " + scoreCount);
     System.out.println("Highest number: " + max);
     System.out.println("Lowest number: " + min);
     System.out.println("Average score: " + average);
   }
}
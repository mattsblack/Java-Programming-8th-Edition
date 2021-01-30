package sugarsmash;

import java.util.Scanner;

public class DemoSugarSmash {
	public static void main(String[] args) {
	  boolean paying;
      int id, highScore, count = 0;
      String name;
      SugarSmashPlayer player;
      PremiumSugarSmashPlayer pPlayer;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your player name >> ");
      name = input.nextLine();
      System.out.print("Enter your id >> ");
      id = input.nextInt();
      input.nextLine();
      System.out.print("Do you want to pay $2.99 for 40 more levels? ");
      paying = input.nextBoolean();
      input.nextLine();
      if(paying){
          pPlayer = new PremiumSugarSmashPlayer(); 
          pPlayer.setId(id);
          pPlayer.setName(name);
          while(count < 50){
              highScore = 0;
              while(highScore < 100){
                      System.out.print("Enter highscore for level "+(count+1)
                          +" >> ");
                      highScore = input.nextInt();
                      input.nextLine();
              }
              pPlayer.setHighScores(count, highScore);
              ++count;
          }
      }
      else{
          player = new SugarSmashPlayer();
          player.setId(id);
          player.setName(name);
          while(count < 10){
              highScore = 0;
              while(highScore < 100){
                      System.out.print("Enter highscore for level "+(count+1)
                          +" >> ");
                      highScore = input.nextInt();
                      input.nextLine();
              }
              player.setHighScores(count, highScore);
              ++count;
          }
      }
	}
}

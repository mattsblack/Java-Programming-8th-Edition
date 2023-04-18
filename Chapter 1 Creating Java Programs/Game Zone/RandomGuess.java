import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Think of a number between 1 and 10: ");
        int guess = input.nextInt();
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("Your guess was " + guess + "\n" + "The number was " + random);
    }
}
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int) (Math.random() * 100 + 1);
            //System.out.println(theNumber);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100:");
                guess = s.nextInt();
                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is correct. You win!");
                }
            }
                System.out.println("Would you like to play again (y/n)?"); playAgain = s.next();
            } while (playAgain.equalsIgnoreCase("y"));
        }
    }


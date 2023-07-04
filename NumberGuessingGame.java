import java.util.Scanner;

public class NumberGuessingGame {

    // Function that implements the
    // number guessing game
    public static void guessingNumberGame() {

        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());

        int trials = 6;

        int i, guesses;

        System.out.println("A number is chosen" + " between 1 to 100." + "Guess the number" + " within 5 trials.");

        for (i = 0; i < trials; i++) {

            System.out.println("Guess the number:");
            guesses = sc.nextInt();
            if (number == guesses) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            } else if (number > guesses && i != trials - 1) {
                System.out.println("The number is " + "greater than " + guesses);
            } else if (number < guesses && i != trials - 1) {
                System.out.println("The number is" + " less than " + guesses);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted" + " enough trials.");

            System.out.println("The number was " + number);
        }
    }

    public static void main(String arg[]) {
        guessingNumberGame();
    }
}

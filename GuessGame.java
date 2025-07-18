import java.util.Scanner;
import java.util.Random;

public class GuessGame {
  public static void main(String[] args){
    Random random = new Random();
    int secretNumber = random.nextInt(100) + 1;	
   Scanner scanner = new Scanner(System.in);
   int guess;

	
        System.out.println("Guess the number (between 1 and 100)!");

        while (true) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            try {
                guess = Integer.parseInt(input);
                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                    continue;
                }
                
                if (guess == secretNumber) {
                    System.out.println("Correct! You guessed the number!");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

       
    }
}
   
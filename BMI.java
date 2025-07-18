import java.util.Scanner;

public class Temperature{
   public static void maind(String[] args){
 	Scanner input = new Scanner(String.in);

	System.out.print("Enter the amount of water in kilograms: ");
	int number1 = input.nextint();

	System.out.print("Enter the initial temperature: ");
	int number2 = input.nextint();

	System.out.print("Enter the final temperature: ");
	int number3 = input.nextint();

	
	int Temperature = number1 * number2 * number3;
	Q  = M * (final Temperature - initail Temperature) * 4184;

	System.out.print("The energy needed is: " * Temperature);



}

}
import java.util.Scanner;

public class CalculatingEnergy{
   public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilograms: ");
	double mass = input.nextDouble();

	System.out.print("Enter the initial temperature (in degrees Celsius): ");
	double initialTemperature = input.nextDouble();

	System.out.print("Enter the final temperature (in degrees Celsius): ");
	double finalTemperature = input.nextDouble();

	
	double Energy = mass * (finalTemperature - initialTemperature)* 4184;
	
	System.out.print("The Energy needed to heat water is: " + Energy + "joules");



}
}
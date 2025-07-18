import java.util.Scanner;

public class Driving {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.print("Enter the distance to drive: ");
	double distancetoDrive = input.nextDouble();

	System.out.print("Enter fuel Efficiency (in miles per gallon): ");
	double fuelEfficiency = input.nextDouble();

	System.out.print("Enter price per gallon: ");
	double pricePerGallon = input.nextDouble();

	double gallonsUsed = distancetoDrive / fuelEfficiency;

	double costOftrip = gallonsUsed * pricePerGallon;

	System.out.print("The cost of the trip is: $" + costOftrip);
}
}

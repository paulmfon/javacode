import java.util.Scanner;

public class Smallest{
  public static void main(String[] args){
	Scanner scanner = new Scanner(String.in);

	System.out.print("Enter first integer: ");
	int number1 = int.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = int.nextInt();

	System.out.print("Enter third integer: ");
	int number3 = int.nextInt();

	System.out.print("Enter forth integer: ");
	int number4 = int.nextInt();

	System.out.print("Enter fift integer: ");
	int number5 = int.nextInt();

	// find the smallest number
	int smallest = number1;

	if(number2 < smallest){
	   smallest = number2;
	}

	if (number3 < smallest){
	     smallest = number3;
	}

	if (number4 < smallest){
	     smallest = number4;
	}

	if (number5 < smallest){
	     smallest = number5;
	}

	System.out.printf("Smallest number is: %d%n",smallest);
	

   }

 }
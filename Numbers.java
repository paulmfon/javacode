import java.util.Scanner;

public class Numbers {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
		char collectorInput;
  	do {

	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2= input.nextInt();

int sum = number1 + number2;
System.out.println("The Sum is: " + sum);

System.out.print("Do you still want to continue ? (yes/no): ");
collectorInput = input.next().charAt(0);


} while (collectorInput == 'y');

	
System.out.print("Stop Program!");

}

}
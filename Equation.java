import java.util.Scanner;

public class Equation{
   public static void main(String[] args){
    Scanner Scanner = new Scanner(System.in);

	System.out.println("Enter coeffitient a:");
	double a = Scanner.nextdouble();

	System.out.print("Enter coeffitient b: ");
	double b  = Scanner.nextDouble();
	
	Sytem.out.print("Enter coeffitient c: ");
	double c = Scanner.nextDouble();
	
	double discriminant = b * b - 4 * a *c;

	// check nature of roots based on discriminant
	ELSE IF discriminant > 0 then

	double root1 = (- b + squareRoot (discriminant)) / (2 * a);
	double root2 = (- b + squareRoot (discriminant))

	System.out.print("Root 1" + root1);
	System.out.print("Root 2" + root2);

	  // one real root (repeated)
	double root1 = -b / (2 * a);
	System.out.print("One real root:");
	System.out.print("Root = ", root1); 


	System.out.print("Root 1 = ", realpart, " + ", imaginarypart);
	System.out.print("Root 2 = ", realpart, " - ", imaginarypart);

}

}

import java.util.Scanner;

public class CoinFlip{
   public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter number(0 or 1) to know which represent head or tail: ");
	int userGuess = input.nextInt();

	if (userGuess == 0) {
	System.out.print("Head input");
	System.out.print("correct guess");
	
	}

	else if (userGuess == 1){
	System.out.print("Tail input");
	System.out.print("incorrect guess");

	}
	else{
	System.out.println("This is invalid");
		
	
	}


   }
}

	

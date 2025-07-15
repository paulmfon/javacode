import java.util.Scanner;

public class Patterns{
  public static void main(String[] args){

	System.out.print("");
	 pattern A
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Pattern B: Right-angled triangle (reversed numbers)
        System.out.println("\nPattern B: Right-angled Triangle (Reversed Numbers)");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
	}

	System.out.println("\nPattern C: Centered Triangle (Increasing Numbers)");
        for (int i = 1; i <= 6; i++) {
             Print leading spaces
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
             Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
	}

	System.out.println("\nPattern D: Centered Triangle (Decreasing Numbers)");
        for (int i = 6; i >= 1; i--) {
            Print leading spaces
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print("  ");
            }
             Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

	
            }
          
    }
}   
      
    


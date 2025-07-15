import java.util.Scanner;

public class NumberAnalyzer {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
		
	double max = 0, min = 0;
        boolean firstNumber = true;

        System.out.println("Enter numbers. Type 'stop' to finish.");

        while (true) {
            System.out.print("Enter a number: ");
             double input = scanner.nextLine();
                
            }
                double num = Double.parseDouble(input);
                if (firstNumber) {
                    max = num;
                    min = num;
                    firstNumber = false;
                } else {
                    if (num > max) max = num;
                    if (num < min) min = num;

	           }
               } catch (NumberFormatException e){
                System.out.println("Please enter a valid number or 'stop'.");
            }
        }
	 
	if (! firstNumber){
            System.out.println("Largest: " + max);
            System.out.println("Smallest: " + min);
        } else {
            System.out.println("No numbers entered.");
        }

        
    
}
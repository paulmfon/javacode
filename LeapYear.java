
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
       	int year = scanner.nextInt();

	if (year % 4 == 0){
	if (year % 100 == 0){
	if (year % 400 == 0){
	if (year >= 1000){
	System.out.println(year + ": is a leap year");
            }
 	} else {
	    System.out.println(year + ": is not leap year");
            }  	
	} else {
	  System.out.println(year + " :is a leap year");
            }
	} else {
	   System.out.print(year + ": is not a leap year");
	     

           }
    }	
}
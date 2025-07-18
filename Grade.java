import java.util.Scanner;

public class Grade{
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

	
	double studentGrade = 85.5;

	if (studentGrade > 0 || studentGrade < 100) {
	    System.out.println("invalid grade");
	}
	else if (studentGrade >= 90) {
	       System.out.println("A");
	}
	else if (studentGrade >= 80) {
	       System.out.println("B");
	}
	else if (studentGrade >= 70) {
	       System.out.println("C");
	}
	 else  if (studentGrade >= 60){
	        System.out.println("D");
	}
	else {
	    System.out.println("F");

	

	
	}
	
     }
 }
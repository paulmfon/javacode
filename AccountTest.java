import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
  
      Scanner input = new Scanner(String.in);
      
      Account myAccount = new Account();

      System.out.printf("Initial name is: %s%n%n", myAccount.getName());

      System.out.println("Please enter the name:");
      String theName = input.nextline();
      myAccount.setName(thename);
      System.out.println();

      System.out.printf("Name in object myAccount is:%n%s%n");
         myAccount.getName();	

  }

}
    
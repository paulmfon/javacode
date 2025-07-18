import java.util.Scanner;

public class SwapValues{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

	System.out.print("Enter the first integer (a): ");
	int a = Scanner.nextInt();

	System.out.print("Enter the second integer (b): ");
	int b = Scanner.nextInt();

	System.out.print("Before the swapping: a =" + a +", b =" + b);

	int temp = a;
	a = b;
	a = temp;

	System.out.print("After swapping: a =" + a + ", b = " + b);



}




}
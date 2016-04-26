import java.util.Scanner;
import java.util.Random;

public class Session3Assignment3{
	public static void main (String args[])
	{
	Scanner scnr = new Scanner(System.in);
	System.out.println ("Enter the number");
	int num = scnr.nextInt();
	
	int  number = randomnumber(num);
	System.out.println ("The random number to the given number is " + number);	
		
	scnr.close();
	}
	
	public static int randomnumber(int number) {
		Random num = new Random(); 
		
		return num.nextInt(number);
	}
	
}
package wd;
import java.util.Scanner;
class InvalidPinExpection extends Exception
{
	public InvalidPinExpection(String message)
	{
		super(message);
	}
}
public class AtmCard {
	static final int CORRECT_PIN=9381;
	static void validatePin(int enteredPin) throws InvalidPinExpection{
		
		if(enteredPin!=CORRECT_PIN) 
		{
			throw new InvalidPinExpection("Invalid Pin enteder!");
		}
		}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	try {
		System.out.print("Insert Atm Card...");
		System.out.print("Enter Your Four Digit PIN:");
		int pin=sc.nextInt();
				validatePin(pin);
				System.out.println("Pin Verified Access granted");
				System.out.println("You can proceed with withdrawl or option.");						
	}
	catch (InvalidPinExpection e) 
	{
		System.out.println("Acess Denied:"+e.getMessage());
	}
	finally
	{
		System.out.println("Transcation session ended.Please Remove Your Card");
	}
	sc.close();
	}

}

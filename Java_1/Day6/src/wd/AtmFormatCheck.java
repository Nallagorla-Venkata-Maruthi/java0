package wd;
import java.util.Scanner;
class InvalidFormatException extends Exception {
    public InvalidFormatException(String message) {
        super(message);
    }
}
public class AtmFormatCheck {
    static final int CORRECT_PIN = 4321;
    static void validatePin(int enteredPin) throws InvalidFormatException {
        String p= String.valueOf(enteredPin);
        if (p.length()!=4) {
            throw new InvalidFormatException("Entered Pin must in Four Digits");
        }
        if (enteredPin != CORRECT_PIN) {
            throw new InvalidFormatException("Entered pin is incorrect");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert ATM Card...");
        try {
            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();
            validatePin(pin);
            System.out.println("Pin verified Gratanted Here.");
            System.out.println("You can proceed with withdrawal or other options.");
        } 
        catch (InvalidFormatException e) 
        {
            System.out.println("Access Denied:" +e.getMessage());
        } 
        finally 
        {
            System.out.println("Transaction session ended.Please Remove Your Card.");
        }
        sc.close();
    }
}

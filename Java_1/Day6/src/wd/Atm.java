package wd;
import java.util.*;
class InvalidPinException extends Exception 
{
    public InvalidPinException(String msg) 
    {
        super(msg);
    }
}
class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String msg) 
    {
        super(msg);
    }
}

class Account {
    int pin;
    double bal;
    Account(int pin, double bal) {
        this.pin = pin;
        this.bal = bal;
    }
    void deposit(double amt) 
    {
        bal=bal+amt;
        System.out.println("Deposited:₹"+amt);
    }

    void withdraw(double amt) throws InsufficientBalanceException {
        if (amt>bal) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        bal=bal-amt;
        System.out.println("Withdrawn:₹"+amt);
    }
    double getBalance() {
        return bal;
    }
}

public class Atm {
    static Map<Integer,Account>accs = new HashMap<>();

    static {
        accs.put(101,new Account(1111, 5000));
        accs.put(102,new Account(2222, 3000));
        accs.put(103,new Account(3333, 7000));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Insert card...");
            System.out.print("Enter acc number: ");
            int accno = sc.nextInt();
            if (!accs.containsKey(accno)) {
                throw new InvalidPinException("Account not found");
            }
            Account acc = accs.get(accno);
            int tries = 0;
            while (tries < 3) {
                System.out.print("Enter 4 digit PIN: ");
                int pin = sc.nextInt();
                if (pin == acc.pin) {
                    System.out.println("Access given!");
                    while (true) {
                        System.out.println("1.Balance 2.Deposit 3.Withdraw 4.Exit");
                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                System.out.println("Balance: ₹" + acc.getBalance());
                                break;
                            case 2:
                                System.out.print("Enter amount to deposit: ");
                                acc.deposit(sc.nextDouble());
                                break;
                            case 3:
                                System.out.print("Enter amount to withdraw: ");
                                try {
                                    acc.withdraw(sc.nextDouble());
                                } catch (InsufficientBalanceException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 4:
                                System.out.println("Thanks, card removed.");
                                return;
                            default:
                                System.out.println("Wrong choice.");
                        }
                    }

                } else {
                    tries++;
                    if (tries == 3) 
                    {
                        throw new InvalidPinException("3 times wrong PIN. Card blocked.");
                    }
                    System.out.println("Wrong PIN. Tries left: " + (3 - tries));
                }
            }
        } 
        catch (InvalidPinException e) 
        {
            System.out.println("Error:"+ e.getMessage());
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Only numbers allowed");
        } 
        finally 
        {
            System.out.println("Session end. Remove card.");
            sc.close();
        }
    }
}

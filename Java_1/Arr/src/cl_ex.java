
import java.util.Scanner;

public class cl_ex {
    int balance;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit:" + amount);
    }

    void withdraw(int amount) {
        balance = balance - amount;
        System.out.println("Withdraw:" + amount);
    }

    void display() {
        System.out.println("Current Balance:" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cl_ex account = new cl_ex();
        
        System.out.print("Enter amount to deposit:");
        int dep = sc.nextInt();
        account.deposit(dep);

        System.out.print("Enter amount to withdraw:");
        int wit = sc.nextInt();
        account.withdraw(wit);

        account.display();
        sc.close();
    }
}

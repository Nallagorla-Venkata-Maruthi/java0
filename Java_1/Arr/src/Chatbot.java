import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.print("You: ");
        String msg1 = sc.nextLine();

        if (msg1.equalsIgnoreCase("hi")) {
            System.out.println("bot: Hello! Who are you?");
        } else {
            System.out.println("bot: Sorry, I can't understand that.");
            sc.close();
            return;
        }

        System.out.print("You: ");
        String msg2 = sc.nextLine();

        if (msg2.equalsIgnoreCase("what are you doing")) {
            System.out.println("bot: I am doing great, what about you?");
        } else {
            System.out.println("bot: Sorry, I can't understand that.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Usecase {

    String bookName;
    String author;
    int price;

    void setDetails(String name, String writer, int cost) {
        bookName = name;
        author = writer;
        price = cost;
    }

    void display() {
        System.out.println("Book Name:" + bookName);
        System.out.println("Author:" + author);
        System.out.println("Price:" + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usecase b = new Usecase();

        System.out.print("Enter book name:");
        String name = sc.nextLine();

        System.out.print("Enter author name:");
        String writer = sc.nextLine();

        System.out.print("Enter book price:");
        int cost = sc.nextInt();

        b.setDetails(name, writer, cost);
        b.display();

        sc.close();
    }
}

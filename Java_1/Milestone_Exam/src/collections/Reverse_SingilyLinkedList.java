package collections;
import java.util.Scanner;

class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

public class Reverse_SingilyLinkedList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        if (numberOfElements > 0) {
            SinglyLinkedList.Node head = new SinglyLinkedList.Node(scanner.nextInt());
            SinglyLinkedList linkedList = new SinglyLinkedList(head);

            for (int i = 1; i < numberOfElements; i++) {
                linkedList.add(new SinglyLinkedList.Node(scanner.nextInt()));
            }

            linkedList.reverse();
            linkedList.print();
        }

        scanner.close();
    }
}
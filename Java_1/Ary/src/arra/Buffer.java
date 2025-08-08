package arra;

public class Buffer {

    public static void main(String[] args) {
        
        StringBuffer rec = new StringBuffer();

        rec.append("Receipt\n");
        rec.append("Customer: Maruthi\n");
        rec.append("Items: Bags\n");
        rec.append("1. Cricket - 45\n");

        rec.insert(0, "-BILL-\n");

        int start = rec.indexOf("Cricket");
        int end = start + "Cricket".length();
        rec.replace(start, end, "Bat");

        System.out.println("Original Receipt");
        System.out.println(rec);

        rec.reverse();
        System.out.println("\nReversed Receipt");
        System.out.println(rec);
    }
}

public class Stringbuff {

    public static void main(String[] args) {

        StringBuffer rec = new StringBuffer();

        rec.append("Receipt\n");
        rec.append("Customer: Maruthi \n");
        rec.append("Items: \n");
        rec.append("1. Cricket - 45 \n");

        rec.insert(0,"bill");

        int start = rec.indexOf("Cricket");
        int end = start + "Cricket".length();
        rec.replace(start, end, "Bat");

        System.out.println("Original Receipt:\n" + rec);

        rec.reverse();
        System.out.println("\nReversed Receipt:\n" + rec);
    }
}

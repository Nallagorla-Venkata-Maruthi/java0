//import java.util.Scanner;
//
//public class array {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//        String[] attendance = new String[7];
//
//        System.out.print("Enter student name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Mark attendance for " + name + " (P = Present, A = Absent):");
//        for (int i = 0; i < 7; i++) {
//            System.out.print(days[i] + ": ");
//            attendance[i] = sc.nextLine().toUpperCase();
//        }
//
//        System.out.println("\nAttendance for " + name + ":");
//        for (int i = 0; i < 7; i++) {
//            System.out.println(days[i] + ": " + attendance[i]);
//        }
//
//        sc.close();
//    }
//}





public class array {
    public static void main(String[] args) {
        int[][] temperatures = new int[3][];

        temperatures[0] = new int[] {22, 28};
        temperatures[1] = new int[] {21, 27};
        temperatures[2] = new int[] {20, 26};

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + " Temperatures:");
            System.out.println("  Morning: " + temperatures[i][0]);
            System.out.println("  Evening: " + temperatures[i][1]);
        }
    }
}
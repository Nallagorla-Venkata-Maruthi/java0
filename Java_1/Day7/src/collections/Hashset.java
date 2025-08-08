package collections;

import java.util.HashSet;
import java.util.Scanner;

class Pati{
    private String name;
    private int id;

    public Pati(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name + ", Patient ID: " + id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;
        Patient other = (Patient) obj;
        return this.id == other.id;
    }
}
public class Hashset {

    public static void main(String[] args) {
        HashSet<Pati> patientSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ Hospital Patient Registration Hashset ------");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    Pati newPatient = new Pati(name, id);
                    
                    if (patientSet.add(newPatient)) {
                        System.out.println("Patient added successfully.");
                    } else {
                        System.out.println("Patient with this ID is already registered.");
                    }
                    break;
                case 2:
                    if (patientSet.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Pati p : patientSet) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice!=3);
        sc.close();
    }
}

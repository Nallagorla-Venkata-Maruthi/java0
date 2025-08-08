import java.util.*;

class Patient {
    private int id;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Patient)) return false;
        Patient p = (Patient) obj;
        return this.id == p.id; // Unique by ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        HashSet<Patient> patientSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ Hospital Patient Registration System ------");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int age = sc.nextInt();

                    Patient newPatient = new Patient(id, name, age);

                    if (patientSet.contains(newPatient)) {
                        System.out.println("Patient already registered with ID: " + id);
                    } else {
                        patientSet.add(newPatient);
                        System.out.println("Patient added successfully!");
                    }
                    break;

                case 2:
                    if (patientSet.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("\n--- Registered Patients ---");
                        for (Patient p : patientSet) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    sc.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

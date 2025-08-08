package collections;
import java.util.*;

class PatientDetails {
    private String name;
    private int age;
    private String disease;

    public PatientDetails(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayPatientDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
        System.out.println("-----------------------");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PatientDetails)) return false;
        PatientDetails other = (PatientDetails) obj;
        return this.name.equalsIgnoreCase(other.name);
    }

    @Override
    public int hashCode() {
        return name.toLowerCase().hashCode();
    }
}

public class Hopital_Op {
    public static void main(String[] args) {
        List<PatientDetails> patientList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        patientList.add(new PatientDetails("Maruthi", 22, "Shoulder"));
        patientList.add(new PatientDetails("Gopi", 20, "Leg"));
        patientList.add(new PatientDetails("Vasu", 25, "Kidney"));

        while (true) {
            System.out.println("\n--------- Hospital Menu ----------");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. View Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Find First/Last Index of a Patient");
            System.out.println("11. Check if List is Empty");
            System.out.println("12. Exit");
            System.out.print("Choose option: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = scan.nextLine();
                    patientList.add(new PatientDetails(name, age, disease));
                    System.out.println("Patient added successfully.");
                    break;

                case 2:
                    System.out.println("All Registered Patients:");
                    if (patientList.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        for (PatientDetails p : patientList) {
                            p.displayPatientDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter index to view: ");
                    int idx = scan.nextInt();
                    if (idx >= 0 && idx < patientList.size()) {
                        patientList.get(idx).displayPatientDetails();
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient Name to Update Disease: ");
                    String updateName = scan.nextLine();
                    boolean updated = false;
                    for (PatientDetails p : patientList) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new disease: ");
                            String newDisease = scan.nextLine();
                            p.setDisease(newDisease);
                            System.out.println("Disease updated successfully.");
                            updated = true;
                        }
                    }
                    if (!updated) System.out.println("Patient not found.");
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIdx = scan.nextInt();
                    if (removeIdx >= 0 && removeIdx < patientList.size()) {
                        patientList.remove(removeIdx);
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = scan.nextLine();
                    boolean removed = false;
                    Iterator<PatientDetails> it = patientList.iterator();
                    while (it.hasNext()) {
                        if (it.next().getName().equalsIgnoreCase(removeName)) {
                            it.remove();
                            removed = true;
                            System.out.println("Patient removed.");
                            break;
                        }
                    }
                    if (!removed) System.out.println("Patient not found.");
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String checkName = scan.nextLine();
                    boolean exists = false;
                    for (PatientDetails p : patientList) {
                        if (p.getName().equalsIgnoreCase(checkName)) {
                            System.out.println("Patient exists.");
                            exists = true;
                            break;
                        }
                    }
                    if (!exists) System.out.println("Patient not found.");
                    break;

                case 8:
                    System.out.println("Total Patients: " + patientList.size());
                    break;

                case 9:
                    patientList.clear();
                    System.out.println("All patient records cleared.");
                    break;

                case 10:
                    System.out.print("Enter patient name to search indexes: ");
                    String nameToSearch = scan.nextLine();
                    int firstIndex = -1, lastIndex = -1;
                    for (int i = 0; i < patientList.size(); i++) {
                        if (patientList.get(i).getName().equalsIgnoreCase(nameToSearch)) {
                            if (firstIndex == -1) firstIndex = i;
                            lastIndex = i;
                        }
                    }
                    if (firstIndex != -1) {
                        System.out.println("First Index: " + firstIndex);
                        System.out.println("Last Index: " + lastIndex);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 11:
                    System.out.println(patientList.isEmpty()
                        ? "Patient list is empty."
                        : "Patient list is not empty.");
                    break;

                case 12:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

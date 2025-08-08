package Inputoutput;
import java.io.*;
import java.util.Scanner;

class Patient implements Serializable // marker interface (means no methods or fields)
{
    int id;
    String name;
    String disease;
    int age;
    

    public Patient(int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public String toString() {
        return id + " - " + name + " - " + disease + " - " + age;
    }
}

public class PatientApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Disease:");
        String disease = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        Patient p = new Patient(id, name, disease, age);

        // Save patient object to file (Serialization)
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\91938\\OneDrive\\Desktop\\Maruthi\\pat.dat"));
            out.writeObject(p);
            out.close();
            System.out.println("Patient saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Read patient object from file (Deserialization)
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\91938\\OneDrive\\Desktop\\Maruthi\\pat.dat"));
            Patient savedPatient = (Patient) in.readObject();
            in.close();
            System.out.println("\nSaved Patient:");
            System.out.println(savedPatient);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}

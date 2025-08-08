package Inputoutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class PatientApp implements Serializable {
    private int id;
    private String name;
    private String disease;
    private int age;
    private String gender;
    private String contact;

    public PatientApp(int id,String name,String disease,int age,String gender,String contact) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String toString() {
        return id + "-" + name + "-" + disease + "-" + age + "-" + gender + "-" + contact;
    }
}

public class patient {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String pname=sc.nextLine();
		
		System.out.println("Enter Name");
		String dname=sc.nextLine();
		
		System.out.println("Enter AGE");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Gender");
		String gname=sc.nextLine();
		
		System.out.println("Enter Contact");
		String cname=sc.nextLine();
		
		patient p=new patient();
		
		try {
			ObjectOutputStream f=new ObjectOutputStream(new FileOutputStream("patient5.dat"));
			f.writeObject(p);
            f.close();
            System.out.println("\nPatient saved successfully.");
		}
		catch(Exception e){
			System.out.println("Error writing file: " + e.getMessage());
		}
		try {
			ObjectInputStream file=new ObjectInputStream(new FileInputStream("patient5.dat"));
			patient readpatient=(patient) file.readObject();
			file.close();
			System.out.println("Save PAtient Details");
			System.out.println(readpatient);
		}
		catch(Exception e) {
			System.out.println("Error Reading the fIle...");
		}
		sc.close();
	}

}

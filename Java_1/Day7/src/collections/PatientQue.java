package collections;

import java.util.LinkedList;
import java.util.Scanner;

class PatientQue {
    String id;
    String name;

    PatientQue(String id,String name) {
        this.id = id;
        this.name = name;
    }

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
}
public class PatientQue{

	private static int choice;

	public static void main(String[] args) {
		
		LinkedList<String> patientQueue=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\n---------Hospital Queue System ---------");
            System.out.println("1.Add New Patient (Normal)");
            System.out.println("2.Add Emergency Patient");
            System.out.println("3.Cancel Appointment");
            System.out.println("4.View All Patients");
            System.out.println("5.Call Next Patient (Auto Remove)");
            System.out.println("6.View Last Patient");
            System.out.println("7.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) 
            {
            case 1:
            	System.out.println("Enter Patient name");
            	String patientname=sc.nextLine();
            	patientQueue.addFirst(patientname);
            	System.out.println("Add Patient In the Queue");
            
            }
		}while(choice !=7);
		
	}
		
	}

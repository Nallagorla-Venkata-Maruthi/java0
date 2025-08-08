package collections;
import java.util.*;
import java.util.Scanner;
class Patient
{
	private String name;
	private int age;
	private String disease;
	
	public Patient (String name,int age,String disease) 
	{
	this.name=name;
	this.age=age;
	this.disease=disease;
	}
	public String getName() {
		return name;
	}
	public void DisplayPatientDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Disease:"+disease);
	}
}
public class HospitalOPD {
	public static void main(String[] args) 
{	
ArrayList<Patient> patientList=new ArrayList();
Scanner scan=new Scanner(System.in);
		
patientList.add(new Patient("Maruthi",22,"Shoulder"));
patientList.add(new Patient("Gopi",20,"Leg"));
patientList.add(new Patient("Vasu",25,"Kidney"));

while(true){
	
	System.out.println("\n---------Hospital Menu----------");
	System.out.println("1.Adding new Patient");
	System.out.println("2.Display All Patience");
	System.out.println("3.Search Patient By Name");
	System.out.println("4.Exit");
	System.out.println("Enter Your Choice");
	int choice=scan.nextInt();
	
	scan.nextLine();
	switch(choice) {
	case 1:
		System.out.println("Enter Patient Name:");
		String name=scan.nextLine();
		System.out.println("Enter the Patient Age:");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Patient Disease");
		String disease=scan.nextLine();
		patientList.add(new Patient(name,age,disease));
		System.out.println("Patient Added Successfully");
		break;
	case 2:
		System.out.println("All Registered Patients:");
		for(Patient p : patientList)
		{
			p.DisplayPatientDetails();
		}
		break;	
	case 3:
		System.out.println("Enter patient name to search:");
		String searchName=scan.nextLine();
		boolean found=false;
		
		for(Patient p: patientList)
		{
			if(p.getName().equalsIgnoreCase(searchName)) 
			{
				p.DisplayPatientDetails();
				found=true;
			}
		}
		if(!found)
		{
			System.out.println("No patient found with name :" + searchName);
		}
		break;	
	case 4:
		System.out.println("Exiting...");
		scan.close();
		return;
		
		default: System.out.println("Invalid choice!");
}
}
}
}


package collections;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class PatientQueueDemo {

	public static void main(String[] args) {
		
	LinkedList<String> patientQueue=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	int choice;
	
	do {
		System.out.println("\n---------Hospital Patient Queue----------");
		System.out.println("1.Add New Patient (Normal)");
		System.out.println("2.Add Emergency Patient");
		System.out.println("3.Remove Patient");
		System.out.println("4.View All Patients");
		System.out.println("5.View First and Last Patient");
		System.out.println("6.Exit");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		sc.nextLine();
		
	switch(choice) 
	{
	case 1:
		System.out.println("Enter Patient Name");
		String patient=sc.nextLine();
		patientQueue.addLast(patient);
		System.out.println("Add Patient in Queue");
		break;
	case 2:
		System.out.println("Enter Emergency Patient Name");
		String emergencypatient=sc.nextLine();
		patientQueue.addFirst(emergencypatient);
		System.out.println("Add Patient to Queue in Front");
		
	case 3:
		if(!patientQueue.isEmpty()) 
		{
			String remove=patientQueue.removeFirst();
			System.out.println("Remove Patient: "+remove);
		}
		else 
		{
			System.out.println("No Patient in Queue");	
		}
		break;
	case 4:
		System.out.println("Current Queue:"+patientQueue);
		break;
	case 5:
		if(!patientQueue.isEmpty()) {
			System.out.println("First :"+patientQueue.getFirst());
			System.out.println("Last :"+patientQueue.getLast());
		}
		else
		{
			System.out.println("Queue is Empty");
		}
		break;
	case 6:
		System.out.println("Exiting-------");
	
		default:
			System.out.println("Invalid Choice");
	}
	}while(choice !=6);
	sc.close();		

	}

}

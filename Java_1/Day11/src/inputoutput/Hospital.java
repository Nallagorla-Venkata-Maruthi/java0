package inputoutput;

import java.io.IOException;
import java.util.Scanner;

class patient{
	private int id;
	private int age;
	private String name;
	private String disease;
}
public class Hospital {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String filename="text.txt";
		
		while (true) 
		{
            System.out.println("\n----Hospital Management----");
            System.out.println("1.Add Patient");
            System.out.println("2.View All Patients");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if(choice==1)
            {
            	try 
            	{
            		System.out.println("Enter ID");
            		int id=sc.nextInt();
            		sc.nextLine();
            		System.out.println("Enter Age: ");
            		int age=sc.nextInt();
            		sc.nextLine();
            		System.out.println("Enter Name: ");
            		String name=sc.nextLine();
            		System.out.println("Enter Disease: ");
            		String disease=sc.nextLine();
            		
            		
            		
            	}
            	catch (IOException e) {
                    System.out.println("Error writing patient data: " + e.getMessage());
                }
            }
		}
		

	}

}

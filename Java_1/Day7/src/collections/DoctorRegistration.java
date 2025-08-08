package collections;

import java.util.HashSet;
import java.util.Scanner;

class Doctor{
	private int licencenumber;
	private String name;
	private String department;
	
	public Doctor(int licencenumber,String name,String department) {
		this.name=name;
		this.licencenumber=licencenumber;
		this.department=department;
	}
	public String getDepartment(){
		return department;
	}
	public String getName(){
		return name;
	}
	public int getlicencenumber(){
		return licencenumber;
	}
	
	public boolean equals(Object x) {
		if(this==x) return true;
		if(!(x instanceof Doctor)) return false;
		Doctor d=(Doctor) x;
        return this.licencenumber==(d.licencenumber); 		
	}
	public int hashcode() {
		return Integer.hashCode(licencenumber);
	}

	@Override
	public String toString() {
		return "Doctor [licencenumber=" + licencenumber + ", name=" + name + ", department=" + department + "]";
	}
}

public class DoctorRegistration {

	public static void main(String[] args) {
		HashSet<Doctor> doctorSet = new HashSet<>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("\n----------Doctor Registration----------");
			System.out.println("1.Add New Doctor");
			System.out.println("2.View All Doctors");
			System.out.println("3.Exit");
			System.out.println("Enter Your Choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Doctor Licenece Num");
				int Doc_Lic_Number=sc.nextInt();
				
				System.out.println("Enter Doctor Name");
				String docname=sc.nextLine();
				
				System.out.println("Enter Doc Department");
				String docdep=sc.nextLine();
				
				Doctor newdoctor=new Doctor(Doc_Lic_Number,docname,docdep);
				
				if(doctorSet.add(newdoctor))
				{
					System.out.println("Doctor Added Successfully");
				}
				else
				{
					System.out.println("Doctor Already Added Successfully");
				}
				break;
			case 2:
				if(doctorSet.isEmpty())
				{
					System.out.println("Not Doctors are Register Yet");
				}
				else
				{
					System.out.println(" Doctor Registerd ");
					for(Doctor d: doctorSet) {
						System.out.println(d);
					}
				}
				break;
			case 3:
				System.out.println("Exiting.............");
				sc.close();
				break;
			default:
				System.out.println("Invalid Coice Entered Please Entered Correct Choice");	
			}		
		}
	}
}

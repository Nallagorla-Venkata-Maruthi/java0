package collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Patient1{
	private int id;
	private String patientname;
	private String doctorname;
	private String time;
	
	public Patient1(int id,String patientname,String doctorname,String time) {
		this.patientname=patientname;
		this.id=id;
		this.doctorname=doctorname;
		this.time=time;	
	}
	public int getId() {
		return id;
	}
	public String getPatientname() {
		return patientname;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public String getTime() {
		return time;
	}
	public String toString(){
		return "ID :" + id +"Patientname :"+ patientname + "Doctorname :" +doctorname+ "Time :"+time;		
	}
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof Patient1) {
			return false;
		}
		return id==this.id;
	}	
}
public class HospitalTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,Patient1> patientmap=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("\n------Hospital System---------");
			System.out.println("1.Add Appointment");
			System.out.println("2.view all appointments");
			System.out.println("3.Remove appointment");
			System.out.println("4.Reschedule Appointment");
			System.out.println("5.Next Appointment");
            System.out.println("6.Last Appointment");
			System.out.println("7.Exit");
			System.out.println("Enter Choice :");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter appointment Id: ");
				int id=sc.nextInt();
				System.out.println("Enter patient Name: ");
				String pname=sc.nextLine();
				System.out.println("Enter Doctor name: ");
				String dname=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter Tiem: ");
				String tname=sc.nextLine();
				patientmap.put(id,new Patient1(id,pname,dname,tname));
				System.out.println("Appointment Added Successfully: ");
				break;
			case 2:
				System.out.println("\n All appointments Patients ");
				if(!patientmap.isEmpty()) 
				{
					System.out.println("No Appointments are there Here..");
				}
				else {
					for(Map.Entry<Integer,Patient1> entry: patientmap.entrySet()) {
						System.out.println(entry.getValue());	
					}
				}
				break;
			case 3:
				System.out.println("Enter appointment Id to remove Patient: ");
				int removeid=sc.nextInt();
				if(patientmap.remove(removeid)!=null) {
					System.out.println("Appoint deleted Successfully");
				}
				break;
			case 4:
				System.out.print("Enter ID to reschedule: ");
                int resId = sc.nextInt();
                sc.nextLine();
                if (patientmap.containsKey(resId)) {
                    System.out.print("Enter new time: ");
                    String newTime=sc.nextLine();
                    Patient1 p=patientmap.get(resId);
                    patientmap.put(resId, new Patient1(p.getId(),p.getPatientname(),p.getDoctorname(),newTime));
                    System.out.println("Appointment rescheduled successfully");
                } else {
                    System.out.println("Appointment not found");
                }
                break;
			case 5:
				if (!patientmap.isEmpty()) {
                    System.out.println("Next Appointment: " + patientmap.firstEntry().getValue());
                } else {
                    System.out.println("No appointments scheduled.");
                }
                break;
			case 6:
				if (!patientmap.isEmpty()) {
                    System.out.println("Last Appointment: " + patientmap.lastEntry().getValue());
                } else {
                    System.out.println("No appointments scheduled.");
                }
                break;
			case 7:
				System.out.println("Exiting system. Goodbye!");
                sc.close();
                return;
            default:
            	System.out.println("Invalid Choice1");	
			}	
		}
	
	}

}

package collections;

import java.util.HashMap;

class patients{
	private int id;
	private String name;
	private String disease;
	
	
	public patients(int id,String name,String disease) {
		this.id=id;
		this.name=name;
		this.disease=disease;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDisease() {
		return disease;
	}
	@Override
	public String toString() {
		return"patient{id="+ id + ", name=" + name + ", disease=" + disease + "}";
	}	
}
public class HospitalMap {

	public static void main(String[] args) {
		
		HashMap<Integer,patients> patientMap=new HashMap<>();
		
		patientMap.put(101, new patients(101,"Maruthi","Heart"));
		patientMap.put(102, new patients(102,"Vasu","Kidney"));
		patientMap.put(103, new patients(103,"bhargav","Liver"));
		
		System.out.println("Get the person with ID(102)");
		System.out.println(patientMap.get(102));
		System.out.println("\nGet the person with ID(103)");
		System.out.println(patientMap.get(103));
		
		
		System.out.println("\nDoest Patient with ID (102) Exits or not:");
		System.out.println(patientMap.containsKey(102));
		System.out.println(patientMap.containsKey(103));
		
		System.out.println("\nContains a particular value (sai)");
		System.out.println(patientMap.containsValue(new patients(102,"Vasu","Kidney")));
		
		System.out.println("\nTotal Patients:"+patientMap.size()); //total patients size
		
		System.out.println("\nRemove Particular patient with ID");
		System.out.println(patientMap.remove(102));
		System.out.println("\n Patients after removal:"+patientMap);
		
		System.out.println("\nIs patient map empty:"+ patientMap.isEmpty());
		System.out.println(patientMap);
		
		System.out.println(patientMap.keySet());
		
	
		System.out.println("\nAll Patients:"+ patientMap.values());//for all patients view
	}

}

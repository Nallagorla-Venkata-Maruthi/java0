package Healthcare;

public class GeneralPhysician extends Doctor {

	public GeneralPhysician(String name) {
		super(name,"GeneralPhysician");
	}
	@Override
	public void diagnose(Patient patient) {
		System.out.println("General Physician"+name+"diagnosing patient"+patient.getName());
		System.out.println("Diagnosis"+patient.getIllness());
		
	}

}
